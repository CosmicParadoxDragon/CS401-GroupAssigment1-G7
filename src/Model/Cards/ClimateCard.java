package Model.Cards;

public class ClimateCard extends Card {
  String m_habitat;
  public ClimateCard(String name, String habitat, String abilityLine,
                     int victoryPoints) {
    super(name, abilityLine, victoryPoints);
    m_habitat = habitat;
  }
}
