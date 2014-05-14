/**
 */
package GlobalModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see GlobalModel.GlobalModelFactory
 * @model kind="package"
 * @generated
 */
public interface GlobalModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GlobalModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "/TeamTemplateProject/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GlobalModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GlobalModelPackage eINSTANCE = GlobalModel.impl.GlobalModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link GlobalModel.impl.AppImpl <em>App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GlobalModel.impl.AppImpl
	 * @see GlobalModel.impl.GlobalModelPackageImpl#getApp()
	 * @generated
	 */
	int APP = 0;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__TEAMS = 0;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__PLAYERS = 1;

	/**
	 * The feature id for the '<em><b>Stadiums</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__STADIUMS = 2;

	/**
	 * The feature id for the '<em><b>Cities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__CITIES = 3;

	/**
	 * The feature id for the '<em><b>Championships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__CHAMPIONSHIPS = 4;

	/**
	 * The number of structural features of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GlobalModel.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GlobalModel.impl.TeamImpl
	 * @see GlobalModel.impl.GlobalModelPackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>City</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__CITY = 1;

	/**
	 * The feature id for the '<em><b>Honours</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__HONOURS = 2;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__PLAYERS = 3;

	/**
	 * The feature id for the '<em><b>Stadium</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__STADIUM = 4;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GlobalModel.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GlobalModel.impl.PlayerImpl
	 * @see GlobalModel.impl.GlobalModelPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Year Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__YEAR_OF_BIRTH = 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__POSITION = 2;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Team</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__TEAM = 4;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__WEIGHT = 5;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__HEIGHT = 6;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GlobalModel.impl.StadiumImpl <em>Stadium</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GlobalModel.impl.StadiumImpl
	 * @see GlobalModel.impl.GlobalModelPackageImpl#getStadium()
	 * @generated
	 */
	int STADIUM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADIUM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADIUM__CAPACITY = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADIUM__CITY = 2;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADIUM__TEAMS = 3;

	/**
	 * The number of structural features of the '<em>Stadium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADIUM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Stadium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADIUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GlobalModel.impl.CityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GlobalModel.impl.CityImpl
	 * @see GlobalModel.impl.GlobalModelPackageImpl#getCity()
	 * @generated
	 */
	int CITY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__COUNTRY = 1;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__TEAMS = 2;

	/**
	 * The feature id for the '<em><b>Stadiums</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__STADIUMS = 3;

	/**
	 * The number of structural features of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GlobalModel.impl.ChampionshipImpl <em>Championship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GlobalModel.impl.ChampionshipImpl
	 * @see GlobalModel.impl.GlobalModelPackageImpl#getChampionship()
	 * @generated
	 */
	int CHAMPIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPIONSHIP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPIONSHIP__YEAR = 1;

	/**
	 * The feature id for the '<em><b>Winner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPIONSHIP__WINNER = 2;

	/**
	 * The number of structural features of the '<em>Championship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPIONSHIP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Championship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPIONSHIP_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link GlobalModel.App <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App</em>'.
	 * @see GlobalModel.App
	 * @generated
	 */
	EClass getApp();

	/**
	 * Returns the meta object for the containment reference '{@link GlobalModel.App#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Teams</em>'.
	 * @see GlobalModel.App#getTeams()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Teams();

	/**
	 * Returns the meta object for the containment reference '{@link GlobalModel.App#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Players</em>'.
	 * @see GlobalModel.App#getPlayers()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Players();

	/**
	 * Returns the meta object for the containment reference '{@link GlobalModel.App#getStadiums <em>Stadiums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stadiums</em>'.
	 * @see GlobalModel.App#getStadiums()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Stadiums();

	/**
	 * Returns the meta object for the containment reference '{@link GlobalModel.App#getCities <em>Cities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cities</em>'.
	 * @see GlobalModel.App#getCities()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Cities();

	/**
	 * Returns the meta object for the containment reference '{@link GlobalModel.App#getChampionships <em>Championships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Championships</em>'.
	 * @see GlobalModel.App#getChampionships()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Championships();

	/**
	 * Returns the meta object for class '{@link GlobalModel.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see GlobalModel.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the attribute '{@link GlobalModel.Team#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GlobalModel.Team#getName()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Name();

	/**
	 * Returns the meta object for the reference '{@link GlobalModel.Team#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>City</em>'.
	 * @see GlobalModel.Team#getCity()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_City();

	/**
	 * Returns the meta object for the reference list '{@link GlobalModel.Team#getHonours <em>Honours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Honours</em>'.
	 * @see GlobalModel.Team#getHonours()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Honours();

	/**
	 * Returns the meta object for the containment reference list '{@link GlobalModel.Team#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Players</em>'.
	 * @see GlobalModel.Team#getPlayers()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Players();

	/**
	 * Returns the meta object for the reference '{@link GlobalModel.Team#getStadium <em>Stadium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stadium</em>'.
	 * @see GlobalModel.Team#getStadium()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Stadium();

	/**
	 * Returns the meta object for class '{@link GlobalModel.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see GlobalModel.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link GlobalModel.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GlobalModel.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link GlobalModel.Player#getYearOfBirth <em>Year Of Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year Of Birth</em>'.
	 * @see GlobalModel.Player#getYearOfBirth()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_YearOfBirth();

	/**
	 * Returns the meta object for the attribute '{@link GlobalModel.Player#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see GlobalModel.Player#getPosition()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Position();

	/**
	 * Returns the meta object for the attribute '{@link GlobalModel.Player#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see GlobalModel.Player#getNumber()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Number();

	/**
	 * Returns the meta object for the container reference '{@link GlobalModel.Player#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Team</em>'.
	 * @see GlobalModel.Player#getTeam()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Team();

	/**
	 * Returns the meta object for the attribute '{@link GlobalModel.Player#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see GlobalModel.Player#getWeight()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Weight();

	/**
	 * Returns the meta object for the attribute '{@link GlobalModel.Player#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see GlobalModel.Player#getHeight()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Height();

	/**
	 * Returns the meta object for class '{@link GlobalModel.Stadium <em>Stadium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stadium</em>'.
	 * @see GlobalModel.Stadium
	 * @generated
	 */
	EClass getStadium();

	/**
	 * Returns the meta object for the attribute '{@link GlobalModel.Stadium#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GlobalModel.Stadium#getName()
	 * @see #getStadium()
	 * @generated
	 */
	EAttribute getStadium_Name();

	/**
	 * Returns the meta object for the attribute '{@link GlobalModel.Stadium#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see GlobalModel.Stadium#getCapacity()
	 * @see #getStadium()
	 * @generated
	 */
	EAttribute getStadium_Capacity();

	/**
	 * Returns the meta object for the reference '{@link GlobalModel.Stadium#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>City</em>'.
	 * @see GlobalModel.Stadium#getCity()
	 * @see #getStadium()
	 * @generated
	 */
	EReference getStadium_City();

	/**
	 * Returns the meta object for the reference list '{@link GlobalModel.Stadium#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Teams</em>'.
	 * @see GlobalModel.Stadium#getTeams()
	 * @see #getStadium()
	 * @generated
	 */
	EReference getStadium_Teams();

	/**
	 * Returns the meta object for class '{@link GlobalModel.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City</em>'.
	 * @see GlobalModel.City
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for the attribute '{@link GlobalModel.City#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GlobalModel.City#getName()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_Name();

	/**
	 * Returns the meta object for the attribute '{@link GlobalModel.City#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see GlobalModel.City#getCountry()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_Country();

	/**
	 * Returns the meta object for the reference '{@link GlobalModel.City#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Teams</em>'.
	 * @see GlobalModel.City#getTeams()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_Teams();

	/**
	 * Returns the meta object for the reference '{@link GlobalModel.City#getStadiums <em>Stadiums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stadiums</em>'.
	 * @see GlobalModel.City#getStadiums()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_Stadiums();

	/**
	 * Returns the meta object for class '{@link GlobalModel.Championship <em>Championship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Championship</em>'.
	 * @see GlobalModel.Championship
	 * @generated
	 */
	EClass getChampionship();

	/**
	 * Returns the meta object for the attribute '{@link GlobalModel.Championship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GlobalModel.Championship#getName()
	 * @see #getChampionship()
	 * @generated
	 */
	EAttribute getChampionship_Name();

	/**
	 * Returns the meta object for the attribute '{@link GlobalModel.Championship#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see GlobalModel.Championship#getYear()
	 * @see #getChampionship()
	 * @generated
	 */
	EAttribute getChampionship_Year();

	/**
	 * Returns the meta object for the reference '{@link GlobalModel.Championship#getWinner <em>Winner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Winner</em>'.
	 * @see GlobalModel.Championship#getWinner()
	 * @see #getChampionship()
	 * @generated
	 */
	EReference getChampionship_Winner();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GlobalModelFactory getGlobalModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link GlobalModel.impl.AppImpl <em>App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GlobalModel.impl.AppImpl
		 * @see GlobalModel.impl.GlobalModelPackageImpl#getApp()
		 * @generated
		 */
		EClass APP = eINSTANCE.getApp();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__TEAMS = eINSTANCE.getApp_Teams();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__PLAYERS = eINSTANCE.getApp_Players();

		/**
		 * The meta object literal for the '<em><b>Stadiums</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__STADIUMS = eINSTANCE.getApp_Stadiums();

		/**
		 * The meta object literal for the '<em><b>Cities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__CITIES = eINSTANCE.getApp_Cities();

		/**
		 * The meta object literal for the '<em><b>Championships</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__CHAMPIONSHIPS = eINSTANCE.getApp_Championships();

		/**
		 * The meta object literal for the '{@link GlobalModel.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GlobalModel.impl.TeamImpl
		 * @see GlobalModel.impl.GlobalModelPackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__NAME = eINSTANCE.getTeam_Name();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__CITY = eINSTANCE.getTeam_City();

		/**
		 * The meta object literal for the '<em><b>Honours</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__HONOURS = eINSTANCE.getTeam_Honours();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__PLAYERS = eINSTANCE.getTeam_Players();

		/**
		 * The meta object literal for the '<em><b>Stadium</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__STADIUM = eINSTANCE.getTeam_Stadium();

		/**
		 * The meta object literal for the '{@link GlobalModel.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GlobalModel.impl.PlayerImpl
		 * @see GlobalModel.impl.GlobalModelPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

		/**
		 * The meta object literal for the '<em><b>Year Of Birth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__YEAR_OF_BIRTH = eINSTANCE.getPlayer_YearOfBirth();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__POSITION = eINSTANCE.getPlayer_Position();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NUMBER = eINSTANCE.getPlayer_Number();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__TEAM = eINSTANCE.getPlayer_Team();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__WEIGHT = eINSTANCE.getPlayer_Weight();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__HEIGHT = eINSTANCE.getPlayer_Height();

		/**
		 * The meta object literal for the '{@link GlobalModel.impl.StadiumImpl <em>Stadium</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GlobalModel.impl.StadiumImpl
		 * @see GlobalModel.impl.GlobalModelPackageImpl#getStadium()
		 * @generated
		 */
		EClass STADIUM = eINSTANCE.getStadium();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADIUM__NAME = eINSTANCE.getStadium_Name();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADIUM__CAPACITY = eINSTANCE.getStadium_Capacity();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STADIUM__CITY = eINSTANCE.getStadium_City();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STADIUM__TEAMS = eINSTANCE.getStadium_Teams();

		/**
		 * The meta object literal for the '{@link GlobalModel.impl.CityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GlobalModel.impl.CityImpl
		 * @see GlobalModel.impl.GlobalModelPackageImpl#getCity()
		 * @generated
		 */
		EClass CITY = eINSTANCE.getCity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__NAME = eINSTANCE.getCity_Name();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__COUNTRY = eINSTANCE.getCity_Country();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__TEAMS = eINSTANCE.getCity_Teams();

		/**
		 * The meta object literal for the '<em><b>Stadiums</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__STADIUMS = eINSTANCE.getCity_Stadiums();

		/**
		 * The meta object literal for the '{@link GlobalModel.impl.ChampionshipImpl <em>Championship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GlobalModel.impl.ChampionshipImpl
		 * @see GlobalModel.impl.GlobalModelPackageImpl#getChampionship()
		 * @generated
		 */
		EClass CHAMPIONSHIP = eINSTANCE.getChampionship();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAMPIONSHIP__NAME = eINSTANCE.getChampionship_Name();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAMPIONSHIP__YEAR = eINSTANCE.getChampionship_Year();

		/**
		 * The meta object literal for the '<em><b>Winner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAMPIONSHIP__WINNER = eINSTANCE.getChampionship_Winner();

	}

} //GlobalModelPackage
