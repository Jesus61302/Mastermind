import java.util.*;

public class Color {

    int position;
    char color;
    Boolean paired;

    public Color(int position, char color){
        this.position = position;
        this.color = color;
        this.paired = false;
    }
    public Color(){
        position = 0;
        color = new Character('n');
        paired = false;
    }

    public static Color[] toSet(String code) {
        Color[] code1 = new Color[code.length()];
        for (int i = 0; i < code.length(); i++){
            code1[i] = new Color(i,code.charAt(i));
        }
        return code1;

    }
}
