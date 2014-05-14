/**
 */
package GlobalModel.impl;

import GlobalModel.Championship;
import GlobalModel.GlobalModelPackage;
import GlobalModel.Team;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Championship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GlobalModel.impl.ChampionshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link GlobalModel.impl.ChampionshipImpl#getYear <em>Year</em>}</li>
 *   <li>{@link GlobalModel.impl.ChampionshipImpl#getWinner <em>Winner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChampionshipImpl extends MinimalEObjectImpl.Container implements Championship {
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
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWinner() <em>Winner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinner()
	 * @generated
	 * @ordered
	 */
	protected Team winner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChampionshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlobalModelPackage.Literals.CHAMPIONSHIP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.CHAMPIONSHIP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.CHAMPIONSHIP__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getWinner() {
		if (winner != null && winner.eIsProxy()) {
			InternalEObject oldWinner = (InternalEObject)winner;
			winner = (Team)eResolveProxy(oldWinner);
			if (winner != oldWinner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GlobalModelPackage.CHAMPIONSHIP__WINNER, oldWinner, winner));
			}
		}
		return winner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetWinner() {
		return winner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWinner(Team newWinner, NotificationChain msgs) {
		Team oldWinner = winner;
		winner = newWinner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlobalModelPackage.CHAMPIONSHIP__WINNER, oldWinner, newWinner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWinner(Team newWinner) {
		if (newWinner != winner) {
			NotificationChain msgs = null;
			if (winner != null)
				msgs = ((InternalEObject)winner).eInverseRemove(this, GlobalModelPackage.TEAM__HONOURS, Team.class, msgs);
			if (newWinner != null)
				msgs = ((InternalEObject)newWinner).eInverseAdd(this, GlobalModelPackage.TEAM__HONOURS, Team.class, msgs);
			msgs = basicSetWinner(newWinner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.CHAMPIONSHIP__WINNER, newWinner, newWinner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GlobalModelPackage.CHAMPIONSHIP__WINNER:
				if (winner != null)
					msgs = ((InternalEObject)winner).eInverseRemove(this, GlobalModelPackage.TEAM__HONOURS, Team.class, msgs);
				return basicSetWinner((Team)otherEnd, msgs);
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
			case GlobalModelPackage.CHAMPIONSHIP__WINNER:
				return basicSetWinner(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GlobalModelPackage.CHAMPIONSHIP__NAME:
				return getName();
			case GlobalModelPackage.CHAMPIONSHIP__YEAR:
				return getYear();
			case GlobalModelPackage.CHAMPIONSHIP__WINNER:
				if (resolve) return getWinner();
				return basicGetWinner();
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
			case GlobalModelPackage.CHAMPIONSHIP__NAME:
				setName((String)newValue);
				return;
			case GlobalModelPackage.CHAMPIONSHIP__YEAR:
				setYear((Integer)newValue);
				return;
			case GlobalModelPackage.CHAMPIONSHIP__WINNER:
				setWinner((Team)newValue);
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
			case GlobalModelPackage.CHAMPIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GlobalModelPackage.CHAMPIONSHIP__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case GlobalModelPackage.CHAMPIONSHIP__WINNER:
				setWinner((Team)null);
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
			case GlobalModelPackage.CHAMPIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GlobalModelPackage.CHAMPIONSHIP__YEAR:
				return year != YEAR_EDEFAULT;
			case GlobalModelPackage.CHAMPIONSHIP__WINNER:
				return winner != null;
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
		result.append(", Year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

} //ChampionshipImpl
