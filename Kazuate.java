import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kazuate {
  public static void main(String[] args) throws Exception{
    final int answerNumber = 50;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    Boolean isGameFinish = false;
    int count = 5;
    do {
      Boolean isInputFinish = false;
      int inputNumber = 0;
      System.out.println("あと"+count+"回です");
      do {
        System.out.println("2桁の数字を予想して入力してください:");
        try {
          inputNumber = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
          continue;
        }
        if(10<=inputNumber&& inputNumber<100){
          isInputFinish = true;
        }

      }while(isInputFinish == false);

      if(inputNumber == answerNumber){
        System.out.println("当たり");
        isGameFinish = true;
      }

      if(inputNumber < answerNumber){
        System.out.println("正解より小さいです");
        if(20 <= answerNumber - inputNumber){
          System.out.println("その差は20以上です");
        }
      }

      if(inputNumber > answerNumber){
        System.out.println("正解より大きいです");
        if(20 <= inputNumber - answerNumber){
          System.out.println("その差は20以上です");
        }
      }

      count -= 1;

      if(count == 0){
        System.out.println("ゲームオーバー");
        isGameFinish = true;
      }

    }while(isGameFinish == false);

  }
}