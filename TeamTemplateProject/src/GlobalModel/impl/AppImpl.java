/**
 */
package GlobalModel.impl;

import GlobalModel.App;
import GlobalModel.Championship;
import GlobalModel.City;
import GlobalModel.GlobalModelPackage;
import GlobalModel.Player;
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
 * An implementation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GlobalModel.impl.AppImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link GlobalModel.impl.AppImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link GlobalModel.impl.AppImpl#getStadiums <em>Stadiums</em>}</li>
 *   <li>{@link GlobalModel.impl.AppImpl#getCities <em>Cities</em>}</li>
 *   <li>{@link GlobalModel.impl.AppImpl#getChampionships <em>Championships</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppImpl extends MinimalEObjectImpl.Container implements App {
	/**
	 * The cached value of the '{@link #getTeams() <em>Teams</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams()
	 * @generated
	 * @ordered
	 */
	protected Team teams;

	/**
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected Player players;

	/**
	 * The cached value of the '{@link #getStadiums() <em>Stadiums</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStadiums()
	 * @generated
	 * @ordered
	 */
	protected Stadium stadiums;

	/**
	 * The cached value of the '{@link #getCities() <em>Cities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCities()
	 * @generated
	 * @ordered
	 */
	protected City cities;

	/**
	 * The cached value of the '{@link #getChampionships() <em>Championships</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChampionships()
	 * @generated
	 * @ordered
	 */
	protected Championship championships;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlobalModelPackage.Literals.APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getTeams() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlobalModelPackage.APP__TEAMS, oldTeams, newTeams);
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
				msgs = ((InternalEObject)teams).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GlobalModelPackage.APP__TEAMS, null, msgs);
			if (newTeams != null)
				msgs = ((InternalEObject)newTeams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GlobalModelPackage.APP__TEAMS, null, msgs);
			msgs = basicSetTeams(newTeams, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.APP__TEAMS, newTeams, newTeams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getPlayers() {
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayers(Player newPlayers, NotificationChain msgs) {
		Player oldPlayers = players;
		players = newPlayers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlobalModelPackage.APP__PLAYERS, oldPlayers, newPlayers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayers(Player newPlayers) {
		if (newPlayers != players) {
			NotificationChain msgs = null;
			if (players != null)
				msgs = ((InternalEObject)players).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GlobalModelPackage.APP__PLAYERS, null, msgs);
			if (newPlayers != null)
				msgs = ((InternalEObject)newPlayers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GlobalModelPackage.APP__PLAYERS, null, msgs);
			msgs = basicSetPlayers(newPlayers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.APP__PLAYERS, newPlayers, newPlayers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stadium getStadiums() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlobalModelPackage.APP__STADIUMS, oldStadiums, newStadiums);
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
				msgs = ((InternalEObject)stadiums).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GlobalModelPackage.APP__STADIUMS, null, msgs);
			if (newStadiums != null)
				msgs = ((InternalEObject)newStadiums).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GlobalModelPackage.APP__STADIUMS, null, msgs);
			msgs = basicSetStadiums(newStadiums, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.APP__STADIUMS, newStadiums, newStadiums));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City getCities() {
		return cities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCities(City newCities, NotificationChain msgs) {
		City oldCities = cities;
		cities = newCities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlobalModelPackage.APP__CITIES, oldCities, newCities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCities(City newCities) {
		if (newCities != cities) {
			NotificationChain msgs = null;
			if (cities != null)
				msgs = ((InternalEObject)cities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GlobalModelPackage.APP__CITIES, null, msgs);
			if (newCities != null)
				msgs = ((InternalEObject)newCities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GlobalModelPackage.APP__CITIES, null, msgs);
			msgs = basicSetCities(newCities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.APP__CITIES, newCities, newCities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Championship getChampionships() {
		return championships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChampionships(Championship newChampionships, NotificationChain msgs) {
		Championship oldChampionships = championships;
		championships = newChampionships;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlobalModelPackage.APP__CHAMPIONSHIPS, oldChampionships, newChampionships);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChampionships(Championship newChampionships) {
		if (newChampionships != championships) {
			NotificationChain msgs = null;
			if (championships != null)
				msgs = ((InternalEObject)championships).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GlobalModelPackage.APP__CHAMPIONSHIPS, null, msgs);
			if (newChampionships != null)
				msgs = ((InternalEObject)newChampionships).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GlobalModelPackage.APP__CHAMPIONSHIPS, null, msgs);
			msgs = basicSetChampionships(newChampionships, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlobalModelPackage.APP__CHAMPIONSHIPS, newChampionships, newChampionships));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GlobalModelPackage.APP__TEAMS:
				return basicSetTeams(null, msgs);
			case GlobalModelPackage.APP__PLAYERS:
				return basicSetPlayers(null, msgs);
			case GlobalModelPackage.APP__STADIUMS:
				return basicSetStadiums(null, msgs);
			case GlobalModelPackage.APP__CITIES:
				return basicSetCities(null, msgs);
			case GlobalModelPackage.APP__CHAMPIONSHIPS:
				return basicSetChampionships(null, msgs);
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
			case GlobalModelPackage.APP__TEAMS:
				return getTeams();
			case GlobalModelPackage.APP__PLAYERS:
				return getPlayers();
			case GlobalModelPackage.APP__STADIUMS:
				return getStadiums();
			case GlobalModelPackage.APP__CITIES:
				return getCities();
			case GlobalModelPackage.APP__CHAMPIONSHIPS:
				return getChampionships();
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
			case GlobalModelPackage.APP__TEAMS:
				setTeams((Team)newValue);
				return;
			case GlobalModelPackage.APP__PLAYERS:
				setPlayers((Player)newValue);
				return;
			case GlobalModelPackage.APP__STADIUMS:
				setStadiums((Stadium)newValue);
				return;
			case GlobalModelPackage.APP__CITIES:
				setCities((City)newValue);
				return;
			case GlobalModelPackage.APP__CHAMPIONSHIPS:
				setChampionships((Championship)newValue);
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
			case GlobalModelPackage.APP__TEAMS:
				setTeams((Team)null);
				return;
			case GlobalModelPackage.APP__PLAYERS:
				setPlayers((Player)null);
				return;
			case GlobalModelPackage.APP__STADIUMS:
				setStadiums((Stadium)null);
				return;
			case GlobalModelPackage.APP__CITIES:
				setCities((City)null);
				return;
			case GlobalModelPackage.APP__CHAMPIONSHIPS:
				setChampionships((Championship)null);
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
			case GlobalModelPackage.APP__TEAMS:
				return teams != null;
			case GlobalModelPackage.APP__PLAYERS:
				return players != null;
			case GlobalModelPackage.APP__STADIUMS:
				return stadiums != null;
			case GlobalModelPackage.APP__CITIES:
				return cities != null;
			case GlobalModelPackage.APP__CHAMPIONSHIPS:
				return championships != null;
		}
		return super.eIsSet(featureID);
	}

} //AppImpl
