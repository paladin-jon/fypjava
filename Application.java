package CAPT;

import java.util.Scanner;

public class Application{

  public static void main(String[] args){
    // Ask our questions
    Answers answers = new Asker().ask();

    // Print out one of the answers.
    System.out.println("Your name is: " + answers.name);

    // Process the results
    Results results = new ResultProcessor().process(answers);

    //Save the data
    Database database = new Database();
    database.save(results);

    // Fetch the data
    Results resultsFromDatabase = database.fetch();
  }

};

class Answers { 
  String name;
}

class Asker {
  Answers ask(){
    // Prepare the Answers object.
    Answers answers = new Answers();

    // Ask the first question.
    System.out.println("What is your name?"); 
    Scanner input = new Scanner(System.in);

    // Add it to the Answers object.
    answers.name = input.nextLine();

    // Return the answers
    return answers;
  }
}

class Results {

}

class ResultProcessor {
  Results process(Answers answers){
    return new Results();
  }
}

class Database {
  void save(Results results) { }

  Results fetch () {
    return new Results();
  }
}

