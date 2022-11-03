public class University {
   private String name;
    private int yearOfStart;
   private int structure;
   private String location;

   void setName(String name){
       this.name=name;
   }
   void setYearOfStart(int yearOfStart){
       this.yearOfStart=yearOfStart;
   }
   void setStructure(int structure){
       this.structure=structure;
   }
   void setLocation(String location){
       this.location=location;
   }
   String getName(){
       return name;
   }
   int getYearOfStart(){
       return yearOfStart;
   }
   int getStructure(){
       return structure;
   }
   String getLocation(){
       return location;
   }
}
