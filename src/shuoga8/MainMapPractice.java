package shuoga8;

import java.util.*;

class Front{
    private StudentIDScore studentIDScore;
    private Scanner sc;

    Front(){
        studentIDScore = new StudentIDScore();
        sc = new Scanner(System.in);
    }

    public void add(){
        System.out.println();
    }

    public void delete(){

    }

    public void find(){

    }

    public void list(){

    }
}



class StudentIDScore{
    private Map<Integer,StudentScore> studentIDScore;

    StudentIDScore(){
        // instance StudentScore?
        studentIDScore = new HashMap<>();
    }

    public void makeStudent(Integer iD,StudentScore score){
        studentIDScore.put(iD,score);
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

public class MainMapPractice {
    public static void main(String[] args) {
        Front front = new Front();
        Scanner sc = new Scanner(System.in);
        boolean notLeave = true;
        while (notLeave){
            System.out.println("menu \n  -1: add student score \n  -2: delete student score\n  -3: find score based on id \n  -4: list all student \n  -any: end");
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