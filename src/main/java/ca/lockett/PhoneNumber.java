package ca.lockett;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.*;

public class PhoneNumber {

  public List<String> areaCodes = new ArrayList<>();
  
  public PhoneNumber() {
    areaCodes.add("902");
    areaCodes.add("506");
  }

  public Integer randomDigit(int max) {
    return new Random().nextInt(max);
  }


  public String generateAreaCode() {
    return areaCodes.get(this.randomDigit(areaCodes.size()));
  }

  public String genrateNxx() {
    StringBuffer nxx = new StringBuffer();
    IntStream.of(10, 10, 10).mapToObj(this::randomDigit).forEach(nxx::append);
    return nxx.toString();
  }

  public String generateLastPart() {
    StringBuffer lastPart = new StringBuffer();
    IntStream.of(10, 10, 10, 10).mapToObj(this::randomDigit).forEach(lastPart::append);
    return lastPart.toString();
  }

  public String generatePhoneNumber() {
    StringBuffer phoneNumber = new StringBuffer()
      .append(this.generateAreaCode())
      .append("-")
      .append(this.genrateNxx())
      .append("-")
      .append(this.generateLastPart());
    return phoneNumber.toString();
  }

  public static void main(String[] args) {
    PhoneNumber phoneNumber = new PhoneNumber();
    System.out.println("Here are some phone numbers: ");

    for (int i = 0; i < 10; i++) {
      System.out.printf("%d: %s\n", i, phoneNumber.generatePhoneNumber());
    }
  }

}
