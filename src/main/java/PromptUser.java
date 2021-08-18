import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class PromptUser{

    public static void main(String[] args) {
        Scanner readinput = new Scanner(System.in);
        System.out.print("Enter Something:");
      String enterkey = readinput.nextLine();
        System.out.print( "You Entered : "+ "\""   + enterkey + "\"") ;
      boolean checker =  StringUtils.isNumeric(enterkey);
      if (!checker) {
          System.out.println("\t" + enterkey + "  is not a number");
      }else {
          System.out.println("\t" + enterkey + "  is a number");

      }
        System.out.println(StringUtils.swapCase(enterkey));
        System.out.println(StringUtils.reverse(enterkey));
    }



}
