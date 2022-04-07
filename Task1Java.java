package task1java;
public class Task1Java {
    public static void main(String[] args) {
      NamaBiodata murakami = new NamaBiodata();{
      
      // fullname
      murakami.setFullName("Haruki Murakami");
      System.out.println(murakami.getfullName());

      // birth place
      murakami.setBirthPlace("Japan");
      System.out.println(murakami.getBirthPlace());

      // birth date
      murakami.setBirthDate("12 Januari 1949");
      System.out.println(murakami.getBirthDate());

      // hobby
      murakami.setHobby("Lari marathon");
      System.out.println(murakami.getHobby());

      // zodiac
      murakami.setZodiac("Aquarius");
      System.out.println(murakami.getZodiac());

      // favorite food
      murakami.setFavFood("Ramen");
      System.out.println(murakami.getfavFood());

      // cita-cita
      murakami.setGoals("Penulis");
      System.out.println(murakami.getGoals());
      }  
    }
    
}
