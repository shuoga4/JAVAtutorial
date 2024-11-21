package shuoga3;


public enum Enum {



    CheckRelationShipRate("main","sub"),
    CheckRelationShipChoose("hate", "like");

    private String mainCharacter;
    private String mainHeroine;
    private String hate;
    private String like;

    Enum(String main,String sub){
        this.mainCharacter = main;
        this.mainHeroine = sub;
    }





}
