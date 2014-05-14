/**
 */
package GlobalModel.impl;

import GlobalModel.GlobalModelPackage;
import GlobalModel.Player;
import GlobalModel.Team;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GlobalModel.impl.PlayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link GlobalModel.impl.PlayerImpl#getYearOfBirth <em>Year Of Birth</em>}</li>
 *   <li>{@link GlobalModel.impl.PlayerImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link GlobalModel.impl.PlayerImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link GlobalModel.impl.PlayerImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link GlobalModel.impl.PlayerImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link GlobalModel.impl.PlayerImpl#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlayerImpl extends MinimalEObjectImpl.Container implements Player {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getYearOfBirth() <em>Year Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearOfBirth()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_OF_BIRTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYearOfBirth() <em>Year Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearOfBirth()
	 * @generated
	 * @ordered
	 */
	protected int yearOfBirth = YEAR_OF_BIRTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected String position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int WEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected int weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlobalModelPackage.Literals.PLAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.PLAYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYearOfBirth() {
		return yearOfBirth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearOfBirth(int newYearOfBirth) {
		int oldYearOfBirth = yearOfBirth;
		yearOfBirth = newYearOfBirth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.PLAYER__YEAR_OF_BIRTH, oldYearOfBirth, yearOfBirth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(String newPosition) {
		String oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.PLAYER__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.PLAYER__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getTeam() {
		if (eContainerFeatureID() != GlobalModelPackage.PLAYER__TEAM) return null;
		return (Team)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeam(Team newTeam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTeam, GlobalModelPackage.PLAYER__TEAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeam(Team newTeam) {
		if (newTeam != eInternalContainer() || (eContainerFeatureID() != GlobalModelPackage.PLAYER__TEAM && newTeam != null)) {
			if (EcoreUtil.isAncestor(this, newTeam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTeam != null)
				msgs = ((InternalEObject)newTeam).eInverseAdd(this, GlobalModelPackage.TEAM__PLAYERS, Team.class, msgs);
			msgs = basicSetTeam(newTeam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.PLAYER__TEAM, newTeam, newTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(int newWeight) {
		int oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.PLAYER__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.PLAYER__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GlobalModelPackage.PLAYER__TEAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTeam((Team)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GlobalModelPackage.PLAYER__TEAM:
				return basicSetTeam(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GlobalModelPackage.PLAYER__TEAM:
				return eInternalContainer().eInverseRemove(this, GlobalModelPackage.TEAM__PLAYERS, Team.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GlobalModelPackage.PLAYER__NAME:
				return getName();
			case GlobalModelPackage.PLAYER__YEAR_OF_BIRTH:
				return getYearOfBirth();
			case GlobalModelPackage.PLAYER__POSITION:
				return getPosition();
			case GlobalModelPackage.PLAYER__NUMBER:
				return getNumber();
			case GlobalModelPackage.PLAYER__TEAM:
				return getTeam();
			case GlobalModelPackage.PLAYER__WEIGHT:
				return getWeight();
			case GlobalModelPackage.PLAYER__HEIGHT:
				return getHeight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GlobalModelPackage.PLAYER__NAME:
				setName((String)newValue);
				return;
			case GlobalModelPackage.PLAYER__YEAR_OF_BIRTH:
				setYearOfBirth((Integer)newValue);
				return;
			case GlobalModelPackage.PLAYER__POSITION:
				setPosition((String)newValue);
				return;
			case GlobalModelPackage.PLAYER__NUMBER:
				setNumber((Integer)newValue);
				return;
			case GlobalModelPackage.PLAYER__TEAM:
				setTeam((Team)newValue);
				return;
			case GlobalModelPackage.PLAYER__WEIGHT:
				setWeight((Integer)newValue);
				return;
			case GlobalModelPackage.PLAYER__HEIGHT:
				setHeight((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GlobalModelPackage.PLAYER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GlobalModelPackage.PLAYER__YEAR_OF_BIRTH:
				setYearOfBirth(YEAR_OF_BIRTH_EDEFAULT);
				return;
			case GlobalModelPackage.PLAYER__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case GlobalModelPackage.PLAYER__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case GlobalModelPackage.PLAYER__TEAM:
				setTeam((Team)null);
				return;
			case GlobalModelPackage.PLAYER__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case GlobalModelPackage.PLAYER__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GlobalModelPackage.PLAYER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GlobalModelPackage.PLAYER__YEAR_OF_BIRTH:
				return yearOfBirth != YEAR_OF_BIRTH_EDEFAULT;
			case GlobalModelPackage.PLAYER__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
			case GlobalModelPackage.PLAYER__NUMBER:
				return number != NUMBER_EDEFAULT;
			case GlobalModelPackage.PLAYER__TEAM:
				return getTeam() != null;
			case GlobalModelPackage.PLAYER__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case GlobalModelPackage.PLAYER__HEIGHT:
				return height != HEIGHT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", YearOfBirth: ");
		result.append(yearOfBirth);
		result.append(", Position: ");
		result.append(position);
		result.append(", Number: ");
		result.append(number);
		result.append(", Weight: ");
		result.append(weight);
		result.append(", Height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //PlayerImpl
