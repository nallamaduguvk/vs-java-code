public class questionservice 
{ 

   Question[] questions = new Question[5];

   public questionservice()
   {
    questions[0] = new Question(1, "what","java","cpp","python","csharp","java");

   }

   public void displayQuestions()
    {
          
        System.out.println(questions[0].getQuestion());
    }
}

