/**
 */
package GlobalModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stadium</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GlobalModel.Stadium#getName <em>Name</em>}</li>
 *   <li>{@link GlobalModel.Stadium#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link GlobalModel.Stadium#getCity <em>City</em>}</li>
 *   <li>{@link GlobalModel.Stadium#getTeams <em>Teams</em>}</li>
 * </ul>
 * </p>
 *
 * @see GlobalModel.GlobalModelPackage#getStadium()
 * @model
 * @generated
 */
public interface Stadium extends EObject {
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
	 * @see GlobalModel.GlobalModelPackage#getStadium_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GlobalModel.Stadium#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see GlobalModel.GlobalModelPackage#getStadium_Capacity()
	 * @model
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link GlobalModel.Stadium#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GlobalModel.City#getStadiums <em>Stadiums</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' reference.
	 * @see #setCity(City)
	 * @see GlobalModel.GlobalModelPackage#getStadium_City()
	 * @see GlobalModel.City#getStadiums
	 * @model opposite="Stadiums"
	 * @generated
	 */
	City getCity();

	/**
	 * Sets the value of the '{@link GlobalModel.Stadium#getCity <em>City</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' reference.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(City value);

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' reference list.
	 * The list contents are of type {@link GlobalModel.Team}.
	 * It is bidirectional and its opposite is '{@link GlobalModel.Team#getStadium <em>Stadium</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' reference list.
	 * @see GlobalModel.GlobalModelPackage#getStadium_Teams()
	 * @see GlobalModel.Team#getStadium
	 * @model opposite="Stadium" upper="2"
	 * @generated
	 */
	EList<Team> getTeams();

} // Stadium
