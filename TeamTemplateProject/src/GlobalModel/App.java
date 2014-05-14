/**
 */
package GlobalModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GlobalModel.App#getTeams <em>Teams</em>}</li>
 *   <li>{@link GlobalModel.App#getPlayers <em>Players</em>}</li>
 *   <li>{@link GlobalModel.App#getStadiums <em>Stadiums</em>}</li>
 *   <li>{@link GlobalModel.App#getCities <em>Cities</em>}</li>
 *   <li>{@link GlobalModel.App#getChampionships <em>Championships</em>}</li>
 * </ul>
 * </p>
 *
 * @see GlobalModel.GlobalModelPackage#getApp()
 * @model
 * @generated
 */
public interface App extends EObject {
	/**
	 * Returns the value of the '<em><b>Teams</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teams</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' containment reference.
	 * @see #setTeams(Team)
	 * @see GlobalModel.GlobalModelPackage#getApp_Teams()
	 * @model containment="true"
	 * @generated
	 */
	Team getTeams();

	/**
	 * Sets the value of the '{@link GlobalModel.App#getTeams <em>Teams</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teams</em>' containment reference.
	 * @see #getTeams()
	 * @generated
	 */
	void setTeams(Team value);

	/**
	 * Returns the value of the '<em><b>Players</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Players</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' containment reference.
	 * @see #setPlayers(Player)
	 * @see GlobalModel.GlobalModelPackage#getApp_Players()
	 * @model containment="true"
	 * @generated
	 */
	Player getPlayers();

	/**
	 * Sets the value of the '{@link GlobalModel.App#getPlayers <em>Players</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Players</em>' containment reference.
	 * @see #getPlayers()
	 * @generated
	 */
	void setPlayers(Player value);

	/**
	 * Returns the value of the '<em><b>Stadiums</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stadiums</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stadiums</em>' containment reference.
	 * @see #setStadiums(Stadium)
	 * @see GlobalModel.GlobalModelPackage#getApp_Stadiums()
	 * @model containment="true"
	 * @generated
	 */
	Stadium getStadiums();

	/**
	 * Sets the value of the '{@link GlobalModel.App#getStadiums <em>Stadiums</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stadiums</em>' containment reference.
	 * @see #getStadiums()
	 * @generated
	 */
	void setStadiums(Stadium value);

	/**
	 * Returns the value of the '<em><b>Cities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cities</em>' containment reference.
	 * @see #setCities(City)
	 * @see GlobalModel.GlobalModelPackage#getApp_Cities()
	 * @model containment="true"
	 * @generated
	 */
	City getCities();

	/**
	 * Sets the value of the '{@link GlobalModel.App#getCities <em>Cities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cities</em>' containment reference.
	 * @see #getCities()
	 * @generated
	 */
	void setCities(City value);

	/**
	 * Returns the value of the '<em><b>Championships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Championships</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Championships</em>' containment reference.
	 * @see #setChampionships(Championship)
	 * @see GlobalModel.GlobalModelPackage#getApp_Championships()
	 * @model containment="true"
	 * @generated
	 */
	Championship getChampionships();

	/**
	 * Sets the value of the '{@link GlobalModel.App#getChampionships <em>Championships</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Championships</em>' containment reference.
	 * @see #getChampionships()
	 * @generated
	 */
	void setChampionships(Championship value);

} // App
