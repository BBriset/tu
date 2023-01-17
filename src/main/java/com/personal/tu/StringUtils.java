package com.personal.tu;

import java.text.Normalizer;

public class StringUtils {

  private static final String ALL_VOWELS = "aeiouyAEIOUY";

  /**
   * Renvoie la chaine formée par les voyelles d'une chaine de caractères
   * 
   * @return Chaine avec uniquement des voyelles
   */
  public static String vowels(String candidate) {
    String vowels = "";
    String unaccent = Normalizer.normalize(candidate, Normalizer.Form.NFD)
        .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    char[] letters = unaccent.toCharArray();
    for (int i = 0; i < candidate.length(); i++) {
      if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
        vowels += letters[i];
      }
    }
    return vowels;
  }

  /*
   * Ajoute à présent la méthode uniqueVowels, qui comme la méthode vowels, va
   * renvoyer les voyelles d'une chaine, mais cette fois-ci sans doublon.
   */

  public static String uniqueVowels(String candidate) {
    String vowels = vowels(candidate);
    String uniqueVowels = "";
    for (int i = 0; i < vowels.length(); i++) {

      if (uniqueVowels.indexOf(vowels.charAt(i)) < 0) {
        uniqueVowels += vowels.charAt(i);
      }
    }
    return uniqueVowels;
  }

}