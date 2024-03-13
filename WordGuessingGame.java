import java.util.HashSet;

/**
 * Escreva uma descrição da classe WordGuessingGame aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WordGuessingGame
{
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    private InputReader reader;
    private HashSet<Character> letters;
    
    public WordGuessingGame(){
        hiddenWord = "abc";
        guessedWord = "___";
        numberOfTries = 0;
        reader = new InputReader();
        letters = new HashSet<>();
    }
    
    public void play(){
        
    }
    
    private void showWelcome(){
        System.out.println("Bem-vindo ao Word Guessing Game!");
    }
    
    private void showGuessedWord(){
        System.out.println("Palavra advinhada: " + guessedWord);
    }
    
    public void guess(char letter){
        if(hiddenWord.toLowerCase().contains(Character.toString(letter).toLowerCase()) && !letters.contains(letter)){
            
            letters.add(letter);
            
            for(int i = 0; i < hiddenWord.length(); i++){
                if(hiddenWord.charAt(i) == letter){
                    guessedWord = guessedWord.substring(i).replaceFirst(Character.toString('_'), Character.toString(letter));
                }
            }
                
         }
        
        numberOfTries++;
        
    }
    
    private void showResult(){
        System.out.println("Parabéns, advinhaste a palavra.");
        System.out.println("Nº de tentativas: " + numberOfTries);
    }
    
    public String getHiddenWord(){
        return hiddenWord;
    }
    
    public String getGuessedWord(){
        return guessedWord;
    }
    
    public int getNumberOfTries(){
        return numberOfTries;
    }
}
