public class Pet{
   //private data fields
   private String name;
   private int age;
   private String type;
   
   //public Constructor
   public Pet(){
      setName("Name");
      setAge(0);
      setType("Animal");
   }
   
   public Pet(String newName, int newAge, String newType){
      this.setName(newName);
      this.setAge(newAge);
      this.setType(newType);
   }
   
   //public mutator method
   public void setName(String newName){
      this.name = newName;
   }
   
   
   public void setAge(int newAge){
      this.age = newAge;
   }
   
   
   public void setType(String newType){
      this.type = newType;
   }

   //public accessor, returns data
   public String getName(){
      return this.name;
   }
   
   public int getAge(){
      return this.age;
   }
   
   public String getType(){
      return this.type;
   }
   
   //public toString method that prints out all of the object state
   public String toString(){
      String output = "Pet information\nType: "+getType()+"\nName: "+getName()+"\nAge: "+getAge();
      output+= "\nSound: " + speak(getType());
      return output;
   }
   
   public String speak(String type){
      if(type.equalsIgnoreCase("dog")){//ignores whether input is capitilized or not
         return "woof";
      }
      
      else if(type.equalsIgnoreCase("cat")){
         return "Meow";
      }
      
      else if(type.equalsIgnoreCase("fish")){
         return "Gulp";
      }
      else{return "Noise";}
   }
   
}
