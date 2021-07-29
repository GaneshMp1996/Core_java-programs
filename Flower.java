class Flower{
String name;
String color;
int noOfpetals;

void blomming(){
System.out.println(color+" "+name+" is bloomimg...!");
}

void shedFragrance(){
System.out.println(color+" "+name+
                  " is shedding fragrance...!");
}
void noOfpetals(){
System.out.println(color+" "+ name+" "+  noOfpetals);
}
public static void main(String args[]){
Flower rose= new Flower();
rose.name= "Rose";
rose.color="Red";
rose.noOfpetals=15;
rose.blomming();
rose.shedFragrance();
rose.noOfpetals();
}

}
