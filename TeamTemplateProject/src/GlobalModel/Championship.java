/**
 */
package GlobalModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Championship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GlobalModel.Championship#getName <em>Name</em>}</li>
 *   <li>{@link GlobalModel.Championship#getYear <em>Year</em>}</li>
 *   <li>{@link GlobalModel.Championship#getWinner <em>Winner</em>}</li>
 * </ul>
 * </p>
 *
 * @see GlobalModel.GlobalModelPackage#getChampionship()
 * @model
 * @generated
 */
public interface Championship extends EObject {
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
	 * @see GlobalModel.GlobalModelPackage#getChampionship_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GlobalModel.Championship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see GlobalModel.GlobalModelPackage#getChampionship_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link GlobalModel.Championship#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Winner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GlobalModel.Team#getHonours <em>Honours</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Winner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winner</em>' reference.
	 * @see #setWinner(Team)
	 * @see GlobalModel.GlobalModelPackage#getChampionship_Winner()
	 * @see GlobalModel.Team#getHonours
	 * @model opposite="Honours"
	 * @generated
	 */
	Team getWinner();

	/**
	 * Sets the value of the '{@link GlobalModel.Championship#getWinner <em>Winner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winner</em>' reference.
	 * @see #getWinner()
	 * @generated
	 */
	void setWinner(Team value);

} // Championship
