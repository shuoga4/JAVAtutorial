package shuoga8;

import java.util.*;



class Front{
    private StudentsScore studentsScore;
    private Scanner sc;

    Front(){
        studentsScore = new StudentsScore();
        sc = new Scanner(System.in);
    }

    public void add(){
        System.out.println("Put name : ");
        String name = sc.nextLine();
        int id = makeID();

        while(studentsScore.getStudentsScore().containsKey(id)){
            id = makeID();
        }

        System.out.println("The name is " + name + ". \nYour ID is " + id +". \nHow many subject do you add? ");
        int numOfScore = 0;

        try{
            numOfScore = sc.nextInt();
            String blank = sc.nextLine();
        }catch(Exception e){
            System.out.println("Invalid number");
        }

        StudentScore studentScore = new StudentScore(name);
        for(int i = 0; i < numOfScore; i++){
            System.out.println("what's subject?");
            String sub = sc.nextLine();
            System.out.println("what's score ?");
            int score = -1;
            try{
                score = sc.nextInt();
            }catch(Exception e){
                System.out.println("Invalid number");
            }
            if(score >= 0) {
                studentScore.setScore(sub,score);
                System.out.println(studentScore.getScore());
                String blank = sc.nextLine();
            }

            else{
                System.out.println("try again? y/n");
                String ans = sc.next();
                String blank = sc.nextLine();
                if(ans.equals("y")) numOfScore++;
                else numOfScore = 0;
            }
        }
        if(!studentScore.getScore().isEmpty()) studentsScore.makeStudent(id,studentScore);
    }

    public void delete(){

    }

    public void find(){

    }

    public void list(){

    }

    private int makeID(){
        double random = Math.random();
        random = random * 10000;
        return (int) random;

    }
}


class StudentsScore{
    private Map<Integer,StudentScore> studentsScore;
    StudentsScore(){
        // instance StudentScore?
        studentsScore = new HashMap<>();
    }

    public void makeStudent(Integer iD,StudentScore score){
        studentsScore.put(iD,score);
    }

    public Map<Integer,StudentScore> getStudentsScore(){
        return studentsScore;
    }
}


class StudentScore{
    private final String name;
    private final Map<String,Integer> score;

    StudentScore(String name){
        this.name = name;
        score = new HashMap<>();
    }

    public String getName(){
        return this.name;
    }

    public void setScore(String subject,Integer score){
        this.score.put(subject,score);
    }

    public Map<String,Integer> getScore(){
        return score;
    }
}

public class MainMapPractice{
    public static void main(String[] args) {
        Front front = new Front();
        Scanner sc = new Scanner(System.in);
        boolean notLeave = true;

        while (notLeave){
            System.out.println("-MENU \n  -1: add student and their score \n  -2: delete student info \n  -3: find student based on id \n  -4: list all student \n  -any: end");
            String ans = sc.next();
            switch(ans){
                case "1": front.add();break;
                case "2": front.delete();break;
                case "3": front.find();break;
                case "4": front.list();break;
                default: notLeave = false;
            }
        }
    }
}