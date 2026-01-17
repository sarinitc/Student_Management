 class Students_Management {
    private int id;
    private String name;
    private  double score;
     public Students_Management (int id , String name,double score){
         this.id=id;
         this.name=name;
         this.score= score;

     } public  String getGrade() {
         if (score >= 90) {
             return "A";
         } else if (score >= 80) {
             return "B";

         } else if (score >= 70) {
             return "C";

         } else {
             return "F";
         }
     }
         public void displayInfo(){
             System.out.println(" ID:"+id);
             System.out.println("Name:"+name);
             System.out.println("Score:"+score);
             System.out.println("Grade:"+getGrade());
            System.out.println("----------------------");
        }
    }


