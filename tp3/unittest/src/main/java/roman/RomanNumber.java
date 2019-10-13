
package roman;

import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import java.util.regex.*;
import java.io.*;

public final class RomanNumber extends Number {
  
  public static final long serialVersionUID = 1L;

  // Table des symboles
  private static final LinkedHashMap<String, Integer> SYMBOLS = new LinkedHashMap<>();
  static {
    SYMBOLS.put("M",  1000);
    SYMBOLS.put("CM", 900);
    SYMBOLS.put("D",  500);
    SYMBOLS.put("CD", 400);
    SYMBOLS.put("C",  100);
    SYMBOLS.put("XC", 90);
    SYMBOLS.put("L",  50);
    SYMBOLS.put("XL", 40);
    SYMBOLS.put("X",  10);
    SYMBOLS.put("IX", 9);
    SYMBOLS.put("V",  5);
    SYMBOLS.put("IV", 4);
    SYMBOLS.put("I", 1);
  }

  // Expression reguliere de validation
  private static final Pattern VALIDATION_RE = Pattern.compile(
      "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");

  private final int value;

  public RomanNumber(String romanValue) {
    this.value = fromRoman(romanValue);
  }

  public RomanNumber(int value) {
    this.value = value;
  }

  /**
   * @{inheritDoc}
   */
  @Override
  public double doubleValue() {
    // TODO
    return 0;
  }

  /**
   * @{inheritDoc}
   */
  @Override
  public float floatValue() {
    // TODO
    return 0;
  }

  /**
   * @{inheritDoc}
   */
  @Override
  public int intValue() {
    // TODO
    return 0;
  }

  /**
   * @{inheritDoc}
   */
  @Override
  public long longValue() {
    // TODO
    return 0;
  }

  @Override
  public String toString() {
    return toRoman(this.value);
  }

  public static void valueOf(double value)
  {
    throw new IllegalArgumentException();
  }

  public static RomanNumber valueOf(String roman) {
    return new RomanNumber(roman);
  }

  public static RomanNumber valueOf(int value) {
    return new RomanNumber(value);
  }

	private static int fromRoman(String romanValue)
	{
		int result = 0;
		/* On va utiliser l'expression reguliere pour valider le chiffre romain */
		Matcher m = VALIDATION_RE.matcher(romanValue);
		if (!(m.matches()))
		{ /* Si la string donne ne respecte pas l'expression on renvoie une erreur */
			throw new IllegalArgumentException();
		}
		/* On commence a implementer la transformation */
		/* On va parcourir les caracteres de la string et incrementer le resultat au fur et a mesure */
		int i = 0;
		String tmp = ""; //Nous servira a combiner deux symboles si besoin
		while ( i < romanValue.length() )
		{
				/* Il faut verifier que la combinaison de deux char consecutifs n'est pas soustractive sinon on le traitera comme une paire */
			if ( SYMBOLS.get(romanValue.charAt(i)) < SYMBOLS.get(romanValue.charAt(i + 1)))
			{
				tmp = String.valueOf(romanValue.charAt(i)) +  String.valueOf(romanValue.charAt(i + 1));
				i += 2; //On incremente de deux puisqu'on prend 2 caracteres
			}
			else 
			{
				tmp = String.valueOf(romanValue.charAt(i));
				i ++;
			}
			result += SYMBOLS.get(tmp);
			tmp = "";
		}
		return result;
	}
  private static String toRoman(int value) {
    // TODO
    return "";
  }
}








