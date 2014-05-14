/**
 */
package GlobalModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GlobalModel.City#getName <em>Name</em>}</li>
 *   <li>{@link GlobalModel.City#getCountry <em>Country</em>}</li>
 *   <li>{@link GlobalModel.City#getTeams <em>Teams</em>}</li>
 *   <li>{@link GlobalModel.City#getStadiums <em>Stadiums</em>}</li>
 * </ul>
 * </p>
 *
 * @see GlobalModel.GlobalModelPackage#getCity()
 * @model
 * @generated
 */
public interface City extends EObject {
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
	 * @see GlobalModel.GlobalModelPackage#getCity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GlobalModel.City#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see GlobalModel.GlobalModelPackage#getCity_Country()
	 * @model
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link GlobalModel.City#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GlobalModel.Team#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teams</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' reference.
	 * @see #setTeams(Team)
	 * @see GlobalModel.GlobalModelPackage#getCity_Teams()
	 * @see GlobalModel.Team#getCity
	 * @model opposite="City"
	 * @generated
	 */
	Team getTeams();

	/**
	 * Sets the value of the '{@link GlobalModel.City#getTeams <em>Teams</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teams</em>' reference.
	 * @see #getTeams()
	 * @generated
	 */
	void setTeams(Team value);

	/**
	 * Returns the value of the '<em><b>Stadiums</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GlobalModel.Stadium#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stadiums</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stadiums</em>' reference.
	 * @see #setStadiums(Stadium)
	 * @see GlobalModel.GlobalModelPackage#getCity_Stadiums()
	 * @see GlobalModel.Stadium#getCity
	 * @model opposite="City"
	 * @generated
	 */
	Stadium getStadiums();

	/**
	 * Sets the value of the '{@link GlobalModel.City#getStadiums <em>Stadiums</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stadiums</em>' reference.
	 * @see #getStadiums()
	 * @generated
	 */
	void setStadiums(Stadium value);

} // City
