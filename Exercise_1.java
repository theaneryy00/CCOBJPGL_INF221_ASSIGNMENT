public class Exercise_1 {

    static boolean iWillnotCheat = true;
    static boolean iWillWin = true;
    public static void main(String[] args) throws Exception {

        //Precondition
        assert iWillnotCheat == true: "ay go ning ilaban mo ang pagiging ganyan mo";

        enterCompetition();

        System.out.print(iWillnotCheat);

        //Postcondition

        assert iWillWin == true: "kurot ka saken";

    }

        static void enterCompetition(){
            // iWillnotCheat = false;
            iWillWin = false;

        }
    }


