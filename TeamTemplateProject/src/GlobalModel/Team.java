/**
 */
package GlobalModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GlobalModel.Team#getName <em>Name</em>}</li>
 *   <li>{@link GlobalModel.Team#getCity <em>City</em>}</li>
 *   <li>{@link GlobalModel.Team#getHonours <em>Honours</em>}</li>
 *   <li>{@link GlobalModel.Team#getPlayers <em>Players</em>}</li>
 *   <li>{@link GlobalModel.Team#getStadium <em>Stadium</em>}</li>
 * </ul>
 * </p>
 *
 * @see GlobalModel.GlobalModelPackage#getTeam()
 * @model
 * @generated
 */
public interface Team extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see GlobalModel.GlobalModelPackage#getTeam_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GlobalModel.Team#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GlobalModel.City#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' reference.
	 * @see #setCity(City)
	 * @see GlobalModel.GlobalModelPackage#getTeam_City()
	 * @see GlobalModel.City#getTeams
	 * @model opposite="Teams"
	 * @generated
	 */
	City getCity();

	/**
	 * Sets the value of the '{@link GlobalModel.Team#getCity <em>City</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' reference.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(City value);

	/**
	 * Returns the value of the '<em><b>Honours</b></em>' reference list.
	 * The list contents are of type {@link GlobalModel.Championship}.
	 * It is bidirectional and its opposite is '{@link GlobalModel.Championship#getWinner <em>Winner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Honours</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Honours</em>' reference list.
	 * @see GlobalModel.GlobalModelPackage#getTeam_Honours()
	 * @see GlobalModel.Championship#getWinner
	 * @model opposite="Winner" upper="2"
	 * @generated
	 */
	EList<Championship> getHonours();

	/**
	 * Returns the value of the '<em><b>Players</b></em>' containment reference list.
	 * The list contents are of type {@link GlobalModel.Player}.
	 * It is bidirectional and its opposite is '{@link GlobalModel.Player#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Players</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' containment reference list.
	 * @see GlobalModel.GlobalModelPackage#getTeam_Players()
	 * @see GlobalModel.Player#getTeam
	 * @model opposite="Team" containment="true" upper="2"
	 * @generated
	 */
	EList<Player> getPlayers();

	/**
	 * Returns the value of the '<em><b>Stadium</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GlobalModel.Stadium#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stadium</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stadium</em>' reference.
	 * @see #setStadium(Stadium)
	 * @see GlobalModel.GlobalModelPackage#getTeam_Stadium()
	 * @see GlobalModel.Stadium#getTeams
	 * @model opposite="Teams"
	 * @generated
	 */
	Stadium getStadium();

	/**
	 * Sets the value of the '{@link GlobalModel.Team#getStadium <em>Stadium</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stadium</em>' reference.
	 * @see #getStadium()
	 * @generated
	 */
	void setStadium(Stadium value);

} // Team
