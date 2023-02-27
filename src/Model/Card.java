package Model;

public class Card {
  String m_name, m_abilities, m_text;

  Card() {}

  Card(String name) { m_name = name; }

  Card(String name, String text) {
    m_name = name;
    m_text = text;
  }

  void parseAbilities(String abilityEncoding) {
    // where the ability string will be passed to
    // needs color check -> defining actions -> resolution
  }

  /**
   * @return the m_name
   */
  public String getM_name() { return m_name; }
  /**
   * @return the m_abilities
   */
  public String getM_abilities() { return m_abilities; }
  /**
   * @return the m_text
   */
  public String getM_text() { return m_text; }
}
