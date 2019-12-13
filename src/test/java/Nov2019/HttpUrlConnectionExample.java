package Nov2019;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HttpUrlConnectionExample {

  public static void main(String[] args) throws IOException {
    HttpUrlConnectionExample httpUrlConnectionExample = new HttpUrlConnectionExample();

    httpUrlConnectionExample.sendGetRequest();
  }

  private void sendGetRequest() throws IOException {
    URL url = new URL("https://gturnquist-quoters.cfapps.io/api");
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");
    int responseCode = connection.getResponseCode();
    System.out.println("YCT - status code = " + responseCode);

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    String output;
    List<Quote> quotes = new ArrayList<>();
    while((output = bufferedReader.readLine()) != null) {
      ObjectMapper objectMapper = new ObjectMapper();
      quotes = objectMapper.readValue(output, new TypeReference<List<Quote>>(){});
    }
    quotes.forEach(System.out::println);
    quotes.sort(new QuoteSorter());
    quotes.forEach(System.out::println);
    List<Quote> filteredQuotes = quotes.stream()
        .filter(quote -> quote.getValue().getQuote().contains("Boot"))
        .collect(Collectors.toList());
    filteredQuotes.forEach(System.out::println);
    List<Value> filteredValues = quotes.stream()
        .map(Quote::getValue)
        .collect(Collectors.toList());
    filteredValues.forEach(System.out::println);
  }
}


//
//  public static void main(String[] args) throws IOException {
//    HttpUrlConnectionExample http = new HttpUrlConnectionExample();
//
//    http.sendGetRequest();
//  }
//
//  private void sendGetRequest() throws IOException {
//    String urlString = "https://gturnquist-quoters.cfapps.io/api";
//    URL url = new URL(urlString);
//    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//    connection.setRequestMethod("GET");
////    connection.setRequestProperty("User-Agent", "Mozilla/5.0");
//    int responseCode = connection.getResponseCode();
//    System.out.println("Sending get request: " + url);
//    System.out.println("Response code: " + responseCode);
//    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//    String output;
//    StringBuffer response = new StringBuffer();
//    List<Quote> quotes = new ArrayList<>();
//    while((output = in.readLine()) != null) {
//      ObjectMapper objectMapper = new ObjectMapper();
//      quotes = objectMapper.readValue(output, new com.fasterxml.jackson.core.type.TypeReference<List<Quote>>() {
//      });
//      //      response.append(output + "\n");
//    }
//    in.close();
//    System.out.println(response.toString());
//    quotes.forEach(System.out::println);
//    quotes.sort(new QuoteSorter());
//    quotes.forEach(System.out::println);
//  }
//}

class QuoteSorter implements Comparator<Quote> {
  public int compare(Quote q1, Quote q2) {
    return q2.getValue().getId() - q1.getValue().getId();
  }
}
