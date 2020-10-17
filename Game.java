package com.quizapplication;

public class Game {

    Question[] questions=new Question[3];
    Player player=new Player();

    String[] questionsdata={"Who was the first Prime Minister of INDIA?","Who was the first President of INDIA?","Who the Missile Man of INDIA?"};
    String[] options1={"Indira Gandhi","Mahatma Gandhi","Dr.Homi Bhabha"};
    String[] options2={"Pandit Jawaharlal Nehru","Pandit Jawaharlal Nehru","Dr.Vikram Sarabhai"};
    String[] options3={"Rajendra Prasad","Dr.Rajendra Prasad","Dr.C V Raman"};
    String[] options4={"Mahatma Gandhi","Rajiv Gandhi","DR.A P J Abdul Kalam"};
    int[] answers={2,3,4};


    public void initGame()
    {
//        created three objects
        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }

        for(int i=0;i<3;i++)
        {

            questions[i].question=questionsdata[i];
        questions[i].option1=options1[i];
        questions[i].option2=options2[i];
        questions[i].option3=options3[i];
        questions[i].option4=options4[i];
        questions[i].correctAnswer=answers[i];
        }


    }
    public void play()
    {

          player.getDetails();
          for(int i=0;i<3;i++)
          {
              boolean status=questions[i].askQuestion();
              if(status==true)
              {
                  System.out.println("Vaah vaah !! kya baat hai sahi jawab :)");
                  player.score=player.score+5;
              }
              else{
                  System.out.println("Bade afsos ke sath, yeh galat jawab hai");
                  player.score=player.score-5;
              }
          }

        System.out.println(player.name+" your score is "+player.score);

    }

}
