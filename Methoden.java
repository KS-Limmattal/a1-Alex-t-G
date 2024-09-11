 
public class Methoden {

    public static int round(int zahl){
        int a = ((zahl+50)/100)*100;
        return a; // diese Zeile darf verändert werden :-)
    }

    public static void hours(int seconds){
        int b = (seconds/60/60);
        int c = ((seconds-(b*60*60))/60);
        int d = (seconds-(b*60*60)-(c*60));
        System.out.println (b+":"+c+":"+d);
        // TODO: implementiere hier deine Lösung für b) 
    }
    
    // TODO: Schreibe hier eine Methode für die Aufgabe c)
    public static void sort(int e, int f, int g){
        if (e > f && f > g) {
            System.out.println( e + ">" + f + ">" + g);
        }
        if (e > g && g > f) {
            System.out.println(e+">"+g+">"+f);
        }
        if (g > f && f > e) {
            System.out.println(g + ">" + f + ">" + e);
        }
        if (g > e && e > f) {
            System.out.println(g+">"+e+">"+f);
        }
        if (f > g && g > e) {
            System.out.println(f+">"+g+">"+e);
        }
        if (f > e && e > g) {
            System.out.println(f+">"+e+">"+g);
        }
        if (f == e && e > g) {
            System.out.println(f+"="+e+">"+g);
        }
        if (f == g && g > e) {
            System.out.println(f+"="+g+">"+e);
        }
        if (g == e && e > f) {
            System.out.println(g+"="+e+">"+f);
        }
        if (f == e && e < g) {
            System.out.println(g+">"+f+"="+e);
        }
        if (f == g && g < e) {
            System.out.println(e+">"+f+"="+g);
        }
        if (g == e && e < f) {
            System.out.println(f+">"+g+"="+e);
        }

        if (g == f && f == e) {
            System.out.println(g+"="+f+"="+e);
        }
    }


    public static int distance(double x1, double y1, double x2, double y2){
        // TODO: implementiere hier deine Lösung für d)
        return 0; // diese Zeile darf verändert werden

        
    }





        public static void main(String[] args){
        // Test-Code für Teilaufgabe a)
        System.out.println("Aufgabe a)");
        System.out.println(round(149));
        System.out.println(round(150));
        System.out.println(round(-50));
        System.out.println(round(-49));
        System.out.println();

        // Test-Code für Teilaufgabe b)
        System.out.println("Aufgabe b)");
        // TODO: Schreibe Testcode für die Aufgabe
        hours(0);
        hours(59);
        hours(60);
        hours(100);
        hours(3600);
        hours(4000);
        hours(76543);

        // Test-Code für Teilaufgabe c)
        System.out.println("Aufgabe c)");
        // Test-Code ent-kommentieren, sobald die Funktion programmiert ist
        sort(1, 2, 3);
        sort(1, 3, 2);
        sort(2, 1, 3);
        sort(2, 3, 1);
        sort(3, 1, 2);
        sort(3, 2, 1);
        sort(1, 3, 3);
        sort(-1, -1, -1);
        System.out.println();

        // Test-Code für Teilaufgabe d)
        System.out.println("Aufgabe d)");
        // TODO: Schreibe Testcode für die Aufgabe
        System.out.println();
    }
    
}
