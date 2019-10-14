
package roman;

import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import java.util.regex.*;
import java.util.*;
import java.io.*;

import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

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
	/***********************************************************************/
	/* Methode fromRoman (String romanValue)															 */
	/* Entrée : string correspondant a un chiffre romain									 */
	/* 																																		 */
	/* Sortie : teste la validite et renvoie des IllegalArgumentException  */
	/* si la string n'est pas valide																			 */
	/* Sinon, renvoie un entier correspondant a la valeur de la string		 */
	/***********************************************************************/

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

	/***********************************************************************/
	/* Methode toRoman ( int value ) 													 						 */
	/* Entree : un entier correspondant au chiffre a traduire							 */
	/*																																		 */
	/* Sortie : un string correspondant au chiffre romain									 */
	/* Renvoie des exceptions si la vleur entrée n'est pas valide (entier) */
	/* compris entre 1 et 3999 inclus																			 */
	/***********************************************************************/
  private static String toRoman(int value) {
    /*On initialise un String vide que l'on completera plus tard*/
    String result = "";
    /*On initialise une table de symbole*/
    Set<Entry<String, Integer>> couple = SYMBOLS.entrySet();
    /*On cree un iterator pour la table de symbole au dessus pour pouvoir la parcourir*/
    Iterator<Entry<String, Integer>> it = couple.iterator();
    /*Si la valeur donnee en parametre n'est pas valide on envoie une erreur*/
		if ( value <= 0 && value >= 4000)
		{
			throw new IllegalArgumentException();
		}
<<<<<<< HEAD
		/*On va creer un iterateur pour le parcours de la HashMap */
		Set<Map.Entry<String, Integer>> setSymbols = SYMBOLS.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator = setSymbols.iterator();
		/* On va continuer l'execution jusqu'a ce que la valeur tombe a 0 */
		while ( value > 0 && iterator.hasNext())
		{		
//Map.Entry<Integer, String> v : KNOWN_VALUES.entrySet()
				Map.Entry<String, Integer> e = iterator.next();
				while ( value > e.getValue() )
				{
					result += e.getKey();
					value = value - e.getValue();
				}
=======
		
		/*Tant que le couple suivant de la table n'est pas null*/
    while(it.hasNext())
    {
        /*On cree un tmp qui stock le couple actuel de la table*/
        Entry<String, Integer> tmp = it.next();
        /*Si la valeur donnee en parametre ? egale a la valeur du couple*/
        /*Je crois qu'il y a un truc qui ne vas pas, je me suis aide de l'algo du pdf*/
        while ( value >= tmp.getValue())
		    {
          result = result + tmp.getKey();
          value = value - tmp.getValue();
        }
>>>>>>> 19712d1c30fc1d17760aa04da5b2176b8741eb6c
		}
    return result;
  }
}








