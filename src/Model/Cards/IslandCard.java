package Model.Cards;

public class IslandCard extends Card
{
    String m_habitat;
    public IslandCard(String name, String habitat, String abilityLine, int victoryPoints)
    {
        super(name, abilityLine, victoryPoints);
        m_habitat = habitat;
    }

    
}
