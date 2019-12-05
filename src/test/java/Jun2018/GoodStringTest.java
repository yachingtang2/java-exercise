package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoodStringTest {

  private GoodString goodString = new GoodString();

  @Test
  public void goodStringNone() {
    String string = "bc";

    int length = goodString.countGoodString(string);

    assertEquals(0, length);
  }

  @Test
  public void goodStringOne() {
    String string = "bca";

    int length = goodString.countGoodString(string);

    assertEquals(1, length);
  }

  @Test
  public void goodStringTwo() {
    String string = "bcab";

    int length = goodString.countGoodString(string);

    assertEquals(1, length);
  }

  @Test
  public void goodStringFive() {
    String string = "aeiou";

    int length = goodString.countGoodString(string);

    assertEquals(5, length);
  }

  @Test
  public void goodStringSix() {
    String string = "aeiouxaaaaaa";

    int length = goodString.countGoodString(string);

    assertEquals(6, length);
  }

  @Test
  public void goodString5() {
    String string = "aanaaanaaaaanaaaanaaanaana";

    int length = goodString.countGoodString(string);

    assertEquals(5, length);
  }

  @Test
  public void goodStringLong() {
    String string = "mzbmweyydiadtlcouegmdbyfwurpwbpuvhifnuapwyndmhtqvkgkbhtytszotwflegsjzzszfwtzfpnscguemwrczqxycivdqnkypnxnnpmuduhznoaquudhavrncwfwujpcmiggjmcmkkbnjfeodxkgjgwxtrxingiqquhuwqhdswxxrxuzzfhkplwunfagppcoildagktgdarveusjuqfistulgbglwmfgzrnyxryetwzhlnfewczmnoozlqatugmdjwgzcfabbkoxyjxkatjmpprswkdkobdagwdwxsufeesrvncbszcepigpbzuzoootorzfskcwbqorvwdrmklfdczatfarqdkelalxzxillkfdvpfpxabqlngdscrentzamztvvcvrtcmbqlizijdwtuyfrxolsysxlfebpolcmqsppmrfkyunydtmwbexsngxhwvroandfqjamzkpttslildlrkjoyrpxugiceahgiakevsjoadmkfnkswrawkjxwcmcciabzbrskzazjqtlkiqydptpk";

    int length = goodString.countGoodString(string);

    assertEquals(3, length);
  }

  @Test
  public void goodStringVeryLong() {
    String string = "dydgxwsgmhlracaayipsojleqhpygshcvxwwlneblfmnqgddqpcjxzftwrlgptrkbkrlwgsnlcaudzdujbbqlfzikgxohvhtuvcjmmwvhkxcgyekjkklcjqoneppydpspiwqbkpsunedqixlsifcokfrcvrszcvdyfwuhtzptbbnxbhqjomxrbhjqxvdaserffcvkecqylqprawyquevhvuzcvfmbewpxicskpmzsbsusmaddqkwgfirlzzbczeghmuhxnxejrspcvqejwowqsfhovhctwnhuuveprriyfwstsjdecyyfjbjsdlegqlklxiyrwvlppomdfdtvtkwokiwwpejxibdknponpsxrytoqgjrtjpatmdlhmqegvjhvlehsykrlvvssmambzusxuszyybdrdvzdbexsglyokvmykifwgfncsacjlkathfmnlctsqejfoxyvmtottlhrlypbzisucllqgaaitmxpmfinsowjaawsnmluizvpjbewqcipcqwvsqfbeutdcsdrviozobdytwsimseetqcklnkxtawoxiysvzrakqeispnddxtnfqalswxsmksfooiwxynamdjxnsmkiewkwdpzjpkibcbbmzbiwpmjczcehtczqjzlkgyvszpuuvetdfluuhxpeopuxmdylaysttenjmcedcumoeeicjtxkkvxcxjowrcvlttsqhwkbbmigtqlovjgvi";

    int length = goodString.countGoodString(string);

    assertEquals(4, length);
  }
}
