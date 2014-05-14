/**
 */
package GlobalModel.impl;

import GlobalModel.City;
import GlobalModel.GlobalModelPackage;
import GlobalModel.Stadium;
import GlobalModel.Team;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stadium</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GlobalModel.impl.StadiumImpl#getName <em>Name</em>}</li>
 *   <li>{@link GlobalModel.impl.StadiumImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link GlobalModel.impl.StadiumImpl#getCity <em>City</em>}</li>
 *   <li>{@link GlobalModel.impl.StadiumImpl#getTeams <em>Teams</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StadiumImpl extends MinimalEObjectImpl.Container implements Stadium {
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
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected City city;

	/**
	 * The cached value of the '{@link #getTeams() <em>Teams</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> teams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StadiumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlobalModelPackage.Literals.STADIUM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.STADIUM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.STADIUM__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City getCity() {
		if (city != null && city.eIsProxy()) {
			InternalEObject oldCity = (InternalEObject)city;
			city = (City)eResolveProxy(oldCity);
			if (city != oldCity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GlobalModelPackage.STADIUM__CITY, oldCity, city));
			}
		}
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City basicGetCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCity(City newCity, NotificationChain msgs) {
		City oldCity = city;
		city = newCity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlobalModelPackage.STADIUM__CITY, oldCity, newCity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(City newCity) {
		if (newCity != city) {
			NotificationChain msgs = null;
			if (city != null)
				msgs = ((InternalEObject)city).eInverseRemove(this, GlobalModelPackage.CITY__STADIUMS, City.class, msgs);
			if (newCity != null)
				msgs = ((InternalEObject)newCity).eInverseAdd(this, GlobalModelPackage.CITY__STADIUMS, City.class, msgs);
			msgs = basicSetCity(newCity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.STADIUM__CITY, newCity, newCity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Team> getTeams() {
		if (teams == null) {
			teams = new EObjectWithInverseResolvingEList<Team>(Team.class, this, GlobalModelPackage.STADIUM__TEAMS, GlobalModelPackage.TEAM__STADIUM);
		}
		return teams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GlobalModelPackage.STADIUM__CITY:
				if (city != null)
					msgs = ((InternalEObject)city).eInverseRemove(this, GlobalModelPackage.CITY__STADIUMS, City.class, msgs);
				return basicSetCity((City)otherEnd, msgs);
			case GlobalModelPackage.STADIUM__TEAMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTeams()).basicAdd(otherEnd, msgs);
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
			case GlobalModelPackage.STADIUM__CITY:
				return basicSetCity(null, msgs);
			case GlobalModelPackage.STADIUM__TEAMS:
				return ((InternalEList<?>)getTeams()).basicRemove(otherEnd, msgs);
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
			case GlobalModelPackage.STADIUM__NAME:
				return getName();
			case GlobalModelPackage.STADIUM__CAPACITY:
				return getCapacity();
			case GlobalModelPackage.STADIUM__CITY:
				if (resolve) return getCity();
				return basicGetCity();
			case GlobalModelPackage.STADIUM__TEAMS:
				return getTeams();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GlobalModelPackage.STADIUM__NAME:
				setName((String)newValue);
				return;
			case GlobalModelPackage.STADIUM__CAPACITY:
				setCapacity((Integer)newValue);
				return;
			case GlobalModelPackage.STADIUM__CITY:
				setCity((City)newValue);
				return;
			case GlobalModelPackage.STADIUM__TEAMS:
				getTeams().clear();
				getTeams().addAll((Collection<? extends Team>)newValue);
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
			case GlobalModelPackage.STADIUM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GlobalModelPackage.STADIUM__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case GlobalModelPackage.STADIUM__CITY:
				setCity((City)null);
				return;
			case GlobalModelPackage.STADIUM__TEAMS:
				getTeams().clear();
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
			case GlobalModelPackage.STADIUM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GlobalModelPackage.STADIUM__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case GlobalModelPackage.STADIUM__CITY:
				return city != null;
			case GlobalModelPackage.STADIUM__TEAMS:
				return teams != null && !teams.isEmpty();
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
		result.append(", Capacity: ");
		result.append(capacity);
		result.append(')');
		return result.toString();
	}

} //StadiumImpl
