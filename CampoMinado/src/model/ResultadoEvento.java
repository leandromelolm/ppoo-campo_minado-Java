package model;
/**
 *
 * @author leandro melo
 */
public class ResultadoEvento {
  
  private final boolean ganhou;

  public ResultadoEvento(boolean ganhou) {
    this.ganhou = ganhou;
  }

  public boolean isGanhou() {
    return ganhou;
  }

}