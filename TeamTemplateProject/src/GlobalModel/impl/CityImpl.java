/**
 */
package GlobalModel.impl;

import GlobalModel.City;
import GlobalModel.GlobalModelPackage;
import GlobalModel.Stadium;
import GlobalModel.Team;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GlobalModel.impl.CityImpl#getName <em>Name</em>}</li>
 *   <li>{@link GlobalModel.impl.CityImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link GlobalModel.impl.CityImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link GlobalModel.impl.CityImpl#getStadiums <em>Stadiums</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CityImpl extends MinimalEObjectImpl.Container implements City {
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
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTeams() <em>Teams</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams()
	 * @generated
	 * @ordered
	 */
	protected Team teams;

	/**
	 * The cached value of the '{@link #getStadiums() <em>Stadiums</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStadiums()
	 * @generated
	 * @ordered
	 */
	protected Stadium stadiums;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlobalModelPackage.Literals.CITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.CITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.CITY__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getTeams() {
		if (teams != null && teams.eIsProxy()) {
			InternalEObject oldTeams = (InternalEObject)teams;
			teams = (Team)eResolveProxy(oldTeams);
			if (teams != oldTeams) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GlobalModelPackage.CITY__TEAMS, oldTeams, teams));
			}
		}
		return teams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetTeams() {
		return teams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeams(Team newTeams, NotificationChain msgs) {
		Team oldTeams = teams;
		teams = newTeams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlobalModelPackage.CITY__TEAMS, oldTeams, newTeams);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeams(Team newTeams) {
		if (newTeams != teams) {
			NotificationChain msgs = null;
			if (teams != null)
				msgs = ((InternalEObject)teams).eInverseRemove(this, GlobalModelPackage.TEAM__CITY, Team.class, msgs);
			if (newTeams != null)
				msgs = ((InternalEObject)newTeams).eInverseAdd(this, GlobalModelPackage.TEAM__CITY, Team.class, msgs);
			msgs = basicSetTeams(newTeams, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.CITY__TEAMS, newTeams, newTeams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stadium getStadiums() {
		if (stadiums != null && stadiums.eIsProxy()) {
			InternalEObject oldStadiums = (InternalEObject)stadiums;
			stadiums = (Stadium)eResolveProxy(oldStadiums);
			if (stadiums != oldStadiums) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GlobalModelPackage.CITY__STADIUMS, oldStadiums, stadiums));
			}
		}
		return stadiums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stadium basicGetStadiums() {
		return stadiums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStadiums(Stadium newStadiums, NotificationChain msgs) {
		Stadium oldStadiums = stadiums;
		stadiums = newStadiums;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlobalModelPackage.CITY__STADIUMS, oldStadiums, newStadiums);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStadiums(Stadium newStadiums) {
		if (newStadiums != stadiums) {
			NotificationChain msgs = null;
			if (stadiums != null)
				msgs = ((InternalEObject)stadiums).eInverseRemove(this, GlobalModelPackage.STADIUM__CITY, Stadium.class, msgs);
			if (newStadiums != null)
				msgs = ((InternalEObject)newStadiums).eInverseAdd(this, GlobalModelPackage.STADIUM__CITY, Stadium.class, msgs);
			msgs = basicSetStadiums(newStadiums, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.CITY__STADIUMS, newStadiums, newStadiums));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GlobalModelPackage.CITY__TEAMS:
				if (teams != null)
					msgs = ((InternalEObject)teams).eInverseRemove(this, GlobalModelPackage.TEAM__CITY, Team.class, msgs);
				return basicSetTeams((Team)otherEnd, msgs);
			case GlobalModelPackage.CITY__STADIUMS:
				if (stadiums != null)
					msgs = ((InternalEObject)stadiums).eInverseRemove(this, GlobalModelPackage.STADIUM__CITY, Stadium.class, msgs);
				return basicSetStadiums((Stadium)otherEnd, msgs);
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
			case GlobalModelPackage.CITY__TEAMS:
				return basicSetTeams(null, msgs);
			case GlobalModelPackage.CITY__STADIUMS:
				return basicSetStadiums(null, msgs);
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
			case GlobalModelPackage.CITY__NAME:
				return getName();
			case GlobalModelPackage.CITY__COUNTRY:
				return getCountry();
			case GlobalModelPackage.CITY__TEAMS:
				if (resolve) return getTeams();
				return basicGetTeams();
			case GlobalModelPackage.CITY__STADIUMS:
				if (resolve) return getStadiums();
				return basicGetStadiums();
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
			case GlobalModelPackage.CITY__NAME:
				setName((String)newValue);
				return;
			case GlobalModelPackage.CITY__COUNTRY:
				setCountry((String)newValue);
				return;
			case GlobalModelPackage.CITY__TEAMS:
				setTeams((Team)newValue);
				return;
			case GlobalModelPackage.CITY__STADIUMS:
				setStadiums((Stadium)newValue);
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
			case GlobalModelPackage.CITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GlobalModelPackage.CITY__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case GlobalModelPackage.CITY__TEAMS:
				setTeams((Team)null);
				return;
			case GlobalModelPackage.CITY__STADIUMS:
				setStadiums((Stadium)null);
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
			case GlobalModelPackage.CITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GlobalModelPackage.CITY__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case GlobalModelPackage.CITY__TEAMS:
				return teams != null;
			case GlobalModelPackage.CITY__STADIUMS:
				return stadiums != null;
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
		result.append(", Country: ");
		result.append(country);
		result.append(')');
		return result.toString();
	}

} //CityImpl
