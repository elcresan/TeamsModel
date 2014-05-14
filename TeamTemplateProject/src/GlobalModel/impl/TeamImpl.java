/**
 */
package GlobalModel.impl;

import GlobalModel.Championship;
import GlobalModel.City;
import GlobalModel.GlobalModelPackage;
import GlobalModel.Player;
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GlobalModel.impl.TeamImpl#getName <em>Name</em>}</li>
 *   <li>{@link GlobalModel.impl.TeamImpl#getCity <em>City</em>}</li>
 *   <li>{@link GlobalModel.impl.TeamImpl#getHonours <em>Honours</em>}</li>
 *   <li>{@link GlobalModel.impl.TeamImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link GlobalModel.impl.TeamImpl#getStadium <em>Stadium</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TeamImpl extends MinimalEObjectImpl.Container implements Team {
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
	 * The cached value of the '{@link #getCity() <em>City</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected City city;

	/**
	 * The cached value of the '{@link #getHonours() <em>Honours</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHonours()
	 * @generated
	 * @ordered
	 */
	protected EList<Championship> honours;

	/**
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> players;

	/**
	 * The cached value of the '{@link #getStadium() <em>Stadium</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStadium()
	 * @generated
	 * @ordered
	 */
	protected Stadium stadium;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlobalModelPackage.Literals.TEAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.TEAM__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GlobalModelPackage.TEAM__CITY, oldCity, city));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlobalModelPackage.TEAM__CITY, oldCity, newCity);
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
				msgs = ((InternalEObject)city).eInverseRemove(this, GlobalModelPackage.CITY__TEAMS, City.class, msgs);
			if (newCity != null)
				msgs = ((InternalEObject)newCity).eInverseAdd(this, GlobalModelPackage.CITY__TEAMS, City.class, msgs);
			msgs = basicSetCity(newCity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.TEAM__CITY, newCity, newCity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Championship> getHonours() {
		if (honours == null) {
			honours = new EObjectWithInverseResolvingEList<Championship>(Championship.class, this, GlobalModelPackage.TEAM__HONOURS, GlobalModelPackage.CHAMPIONSHIP__WINNER);
		}
		return honours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getPlayers() {
		if (players == null) {
			players = new EObjectContainmentWithInverseEList<Player>(Player.class, this, GlobalModelPackage.TEAM__PLAYERS, GlobalModelPackage.PLAYER__TEAM);
		}
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stadium getStadium() {
		if (stadium != null && stadium.eIsProxy()) {
			InternalEObject oldStadium = (InternalEObject)stadium;
			stadium = (Stadium)eResolveProxy(oldStadium);
			if (stadium != oldStadium) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GlobalModelPackage.TEAM__STADIUM, oldStadium, stadium));
			}
		}
		return stadium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stadium basicGetStadium() {
		return stadium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStadium(Stadium newStadium, NotificationChain msgs) {
		Stadium oldStadium = stadium;
		stadium = newStadium;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlobalModelPackage.TEAM__STADIUM, oldStadium, newStadium);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStadium(Stadium newStadium) {
		if (newStadium != stadium) {
			NotificationChain msgs = null;
			if (stadium != null)
				msgs = ((InternalEObject)stadium).eInverseRemove(this, GlobalModelPackage.STADIUM__TEAMS, Stadium.class, msgs);
			if (newStadium != null)
				msgs = ((InternalEObject)newStadium).eInverseAdd(this, GlobalModelPackage.STADIUM__TEAMS, Stadium.class, msgs);
			msgs = basicSetStadium(newStadium, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.TEAM__STADIUM, newStadium, newStadium));
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
			case GlobalModelPackage.TEAM__CITY:
				if (city != null)
					msgs = ((InternalEObject)city).eInverseRemove(this, GlobalModelPackage.CITY__TEAMS, City.class, msgs);
				return basicSetCity((City)otherEnd, msgs);
			case GlobalModelPackage.TEAM__HONOURS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHonours()).basicAdd(otherEnd, msgs);
			case GlobalModelPackage.TEAM__PLAYERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlayers()).basicAdd(otherEnd, msgs);
			case GlobalModelPackage.TEAM__STADIUM:
				if (stadium != null)
					msgs = ((InternalEObject)stadium).eInverseRemove(this, GlobalModelPackage.STADIUM__TEAMS, Stadium.class, msgs);
				return basicSetStadium((Stadium)otherEnd, msgs);
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
			case GlobalModelPackage.TEAM__CITY:
				return basicSetCity(null, msgs);
			case GlobalModelPackage.TEAM__HONOURS:
				return ((InternalEList<?>)getHonours()).basicRemove(otherEnd, msgs);
			case GlobalModelPackage.TEAM__PLAYERS:
				return ((InternalEList<?>)getPlayers()).basicRemove(otherEnd, msgs);
			case GlobalModelPackage.TEAM__STADIUM:
				return basicSetStadium(null, msgs);
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
			case GlobalModelPackage.TEAM__NAME:
				return getName();
			case GlobalModelPackage.TEAM__CITY:
				if (resolve) return getCity();
				return basicGetCity();
			case GlobalModelPackage.TEAM__HONOURS:
				return getHonours();
			case GlobalModelPackage.TEAM__PLAYERS:
				return getPlayers();
			case GlobalModelPackage.TEAM__STADIUM:
				if (resolve) return getStadium();
				return basicGetStadium();
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
			case GlobalModelPackage.TEAM__NAME:
				setName((String)newValue);
				return;
			case GlobalModelPackage.TEAM__CITY:
				setCity((City)newValue);
				return;
			case GlobalModelPackage.TEAM__HONOURS:
				getHonours().clear();
				getHonours().addAll((Collection<? extends Championship>)newValue);
				return;
			case GlobalModelPackage.TEAM__PLAYERS:
				getPlayers().clear();
				getPlayers().addAll((Collection<? extends Player>)newValue);
				return;
			case GlobalModelPackage.TEAM__STADIUM:
				setStadium((Stadium)newValue);
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
			case GlobalModelPackage.TEAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GlobalModelPackage.TEAM__CITY:
				setCity((City)null);
				return;
			case GlobalModelPackage.TEAM__HONOURS:
				getHonours().clear();
				return;
			case GlobalModelPackage.TEAM__PLAYERS:
				getPlayers().clear();
				return;
			case GlobalModelPackage.TEAM__STADIUM:
				setStadium((Stadium)null);
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
			case GlobalModelPackage.TEAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GlobalModelPackage.TEAM__CITY:
				return city != null;
			case GlobalModelPackage.TEAM__HONOURS:
				return honours != null && !honours.isEmpty();
			case GlobalModelPackage.TEAM__PLAYERS:
				return players != null && !players.isEmpty();
			case GlobalModelPackage.TEAM__STADIUM:
				return stadium != null;
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
		result.append(')');
		return result.toString();
	}

} //TeamImpl
