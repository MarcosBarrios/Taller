package es.uned.lsi.eped.pract2016_2017;

/* Representaci�n de una canci�n                                             */
public interface TuneIF {

  /* Dado un objeto QueryIF conteniendo unos criterios de b�squeda, devuelve */
  /* un valor de verdad indicando si la canci�n los cumple o no los cumple   */
  /* @param   -un objeto QueryIF con unos criterios de b�squeda              */
  /* @return  -si la canci�n cumple TODOS los criterios, devolver� verdadero */
  /*          -si la canci�n incumple algún criterio, devolv�� falso        */
  public boolean match(QueryIF q);
}

