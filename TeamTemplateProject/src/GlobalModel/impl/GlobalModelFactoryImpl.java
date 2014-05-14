/**
 */
package GlobalModel.impl;

import GlobalModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlobalModelFactoryImpl extends EFactoryImpl implements GlobalModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GlobalModelFactory init() {
		try {
			GlobalModelFactory theGlobalModelFactory = (GlobalModelFactory)EPackage.Registry.INSTANCE.getEFactory(GlobalModelPackage.eNS_URI);
			if (theGlobalModelFactory != null) {
				return theGlobalModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GlobalModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GlobalModelPackage.APP: return createApp();
			case GlobalModelPackage.TEAM: return createTeam();
			case GlobalModelPackage.PLAYER: return createPlayer();
			case GlobalModelPackage.STADIUM: return createStadium();
			case GlobalModelPackage.CITY: return createCity();
			case GlobalModelPackage.CHAMPIONSHIP: return createChampionship();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App createApp() {
		AppImpl app = new AppImpl();
		return app;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team createTeam() {
		TeamImpl team = new TeamImpl();
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stadium createStadium() {
		StadiumImpl stadium = new StadiumImpl();
		return stadium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City createCity() {
		CityImpl city = new CityImpl();
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Championship createChampionship() {
		ChampionshipImpl championship = new ChampionshipImpl();
		return championship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalModelPackage getGlobalModelPackage() {
		return (GlobalModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GlobalModelPackage getPackage() {
		return GlobalModelPackage.eINSTANCE;
	}

} //GlobalModelFactoryImpl
