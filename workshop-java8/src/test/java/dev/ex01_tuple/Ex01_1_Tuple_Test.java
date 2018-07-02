package dev.ex01_tuple;

import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.Tuple3;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Exercice 01.1 : Création d'un Tuple.
 */
public class Ex01_1_Tuple_Test {

    /**
     * Utilisation de la structure tuple 2.
     */
    @Test
    public void test_tuple2() {

        // TODO créer une instance de Tuple2 avec 2 valeurs :
        // - la chaine de caractères "Jean"
        // - l'entier 18
        // Tuple2<???> ??? = ???
        Tuple2<String, Integer> prenomAge = Tuple.of("Jean", 18);

        // TODO à partir de l'objet Tuple2, récupérer le nom "Jean"
        String prenom = prenomAge._1;

        // TODO à partir de l'objet Tuple2, récupérer l'age 18
        Integer age = prenomAge._2;


        assertThat(prenom).isEqualTo("Jean");
        assertThat(age).isEqualTo(18);
    }

    /**
     * Utilisation d'un tuple à 3 éléments.
     */
    @Test
    public void test_tuple3() {

        // TODO créer une instance de Tuple3 avec 3 valeurs :
        // - la chaine de caractères "Igor"
        // - l'entier 20
        // - le boolean true
        // Tuple3<???> ??? = ???
        Tuple3<String, Integer, Boolean> prenomAgeAdmin = Tuple.of("Jean", 18, true);


        // TODO à partir de l'objet Tuple3, récupérer le nom "Igor"
        String prenom = prenomAgeAdmin._1;

        // TODO à partir de l'objet Tuple3, récupérer l'age 20
        Integer age = prenomAgeAdmin._2;


        // TODO à partir de l'objet Tuple3, récupérer le booléen true
        Boolean isManager = prenomAgeAdmin._3;

        assertThat(prenom).isEqualTo("Jean");
        assertThat(age).isEqualTo(18);
        assertThat(isManager).isEqualTo(true);
    }
}
