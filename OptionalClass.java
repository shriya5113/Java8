import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        Optional<String> getName = Name();
//        String actualName = getName.get().toString(); //get  optional to  string value
//        System.out.println(actualName);

         //to check if its present or not

//        getName.ifPresent(x -> System.out.println(x));//consumer if present
        getName.ifPresent(System.out::println);
        //or else we can us boolean that is : isPresent Function

//        if(getName.isPresent())
//        {
//            System.out.println(getName);
//        }
        // we more option or if is : orElse and orElseGet
//
//       String name = getName.orElse("NA");
//       String name2 = getName.orElseGet(() -> {
//           return "no such element exists";
//       });//in  we can use supplier
//

        //NOW WE CAN ALSO THROW EXCEPTION

//        String name3 = getName.orElseThrow(NoElement ::new);
        String name4 = getName.orElseThrow(); //NO VALUE PRESENT
        System.out.println(name4);

    }


    public  static Optional<String> Name ()
    {
//        String name= "shriya";
        String name = null;
//        return Optional.of(name);//if its null we can handle trugh using nullable
        //return Optional.ofNullable(name); //or if you want to send empty always means null
        return Optional.empty();
    }
}
