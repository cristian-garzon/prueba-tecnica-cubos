package Main;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cubes {
    private  List<Cube> cubesWords;
    public boolean obtenerPalabra(String palabra){
        generateList();
        List<Character> cubesRepeat = new ArrayList<>();
        int lenght = cubesWords.size();
        for (char word: palabra.toCharArray()) {
            List<Cube> cubeFind = cubesWords.stream().filter(x -> x.getChar1().equals(word)).collect(Collectors.toList());
            if(cubeFind.size() > 1) cubesRepeat = cubeFind.stream().map(Cube::getChar2).collect(Collectors.toList());
            cubesWords.removeIf(x -> x.getChar1().equals(word));
            if(lenght == cubesWords.size()){
                cubesWords.removeIf(x -> x.getChar2().equals(word));
                if(lenght == cubesWords.size() && cubesRepeat.stream().filter(x -> x.equals(word)).collect(Collectors.toList()).size() == 0 )
                    return false;
            }
            lenght = cubesWords.size();
        }
        return true;
    }
    public void generateList(){
        cubesWords = new ArrayList<>();
        cubesWords.add(new Cube('B','O'));
        cubesWords.add(new Cube('X','K'));
        cubesWords.add(new Cube('D','Q'));
        cubesWords.add(new Cube('C','P'));
        cubesWords.add(new Cube('G','T'));
        cubesWords.add(new Cube('R','E'));
        cubesWords.add(new Cube('A','N'));
        cubesWords.add(new Cube('T','G'));
        cubesWords.add(new Cube('Q','D'));
        cubesWords.add(new Cube('F','S'));
        cubesWords.add(new Cube('H','U'));
        cubesWords.add(new Cube('V','I'));
        cubesWords.add(new Cube('A','T'));
        cubesWords.add(new Cube('O','B'));
        cubesWords.add(new Cube('E','R'));
        cubesWords.add(new Cube('F','S'));
        cubesWords.add(new Cube('L','Y'));
        cubesWords.add(new Cube('P','C'));
        cubesWords.add(new Cube('Z','M'));
        cubesWords.add(new Cube('J','W'));
        cubesWords = cubesWords.stream().sorted(Comparator.comparing(Cube::getChar1)).collect(Collectors.toList());
    }
}
