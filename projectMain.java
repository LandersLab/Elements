import java.util.ArrayList;

public class projectMain {
	private static double[] massList = {1.0079,4.0026,6.941,9.0122,10.811,12.0107,14.0067,15.9994,18.9984,20.1797,22.9897,24.305,26.9815,28.0855,30.9738,32.065,35.453,39.948,39.0983,40.078,44.9559,47.867,50.9415,51.9961,54.938,55.845,58.9332,58.6934,63.546,65.39,69.723,72.64,74.9216,78.96,79.904,83.8,85.4678,87.62,88.9059,91.224,92.9064,95.94,98.0,101.07,102.9055,106.42,107.8682,112.411,114.818,118.71,121.76,127.6,126.9045,131.293,132.9055,137.327,138.9055,140.116,140.9077,144.24,145.0,150.36,151.964,157.25,158.9253,162.5,164.9303,167.259,168.9342,173.04,174.967,178.49,180.9479,183.84,186.207,190.23,192.217,195.078,196.9665,200.59,204.3833,207.2,208.9804,209.0,210.0,222.0,223.0,226.0,227.0,232.0381,231.0359,238.0289,237.0,244.0,243.0,247.0,247.0,251.0,252.0,257.0,258.0,259.0,262.0,261.0,262.0,266.0,264.0,277.0,268.0};
	private static String[] nameList = {"Hydrogen","Helium","Lithium","Beryllium","Boron","Carbon","Nitrogen","Oxygen","Fluorine","Neon","Sodium","Magnesium","Aluminum","Silicon","Phosphorus","Sulfur","Chlorine","Argon","Potassium","Calcium","Scandium","Titanium","Vanadium","Chromium","Manganese","Iron","Cobalt","Nickel","Copper","Zinc","Gallium","Germanium","Arsenic","Selenium","Bromine","Krypton","Rubidium","Strontium","Yttrium","Zirconium","Niobium","Molybdenum","Technetium","Ruthenium","Rhodium","Palladium","Silver","Cadmium","Indium","Tin","Antimony","Tellurium","Iodine","Xenon","Cesium","Barium","Lanthanum","Cerium","Praseodymium","Neodymium","Promethium","Samarium","Europium","Gadolinium","Terbium","Dysprosium","Holmium","Erbium","Thulium","Ytterbium","Lutetium","Hafnium","Tantalum","Tungsten","Rhenium","Osmium","Iridium","Platinum","Gold","Mercury","Thallium","Lead","Bismuth","Polonium","Astatine","Radon","Francium","Radium","Actinium","Thorium","Protactinium","Uranium","Neptunium","Plutonium","Americium","Curium","Berkelium","Californium","Einsteinium","Fermium","Mendelevium","Nobelium","Lawrencium","Rutherfordium","Dubnium","Seaborgium","Bohrium","Hassium","Meitnerium"};
	private static String[] symList = {"H","He","Li","Be","B","C","N","O","F","Ne","Na","Mg","Al","Si","P","S","Cl","Ar","K","Ca","Sc","Ti","V","Cr","Mn","Fe","Co","Ni","Cu","Zn","Ga","Ge","As","Se","Br","Kr","Rb","Sr","Y","Zr","Nb","Mo","Tc","Ru","Rh","Pd","Ag","Cd","In","Sn","Sb","Te","I","Xe","Cs","Ba","La","Ce","Pr","Nd","Pm","Sm","Eu","Gd","Tb","Dy","Ho","Er","Tm","Yb","Lu","Hf","Ta","W","Re","Os","Ir","Pt","Au","Hg","Tl","Pb","Bi","Po","At","Rn","Fr","Ra","Ac","Th","Pa","U","Np","Pu","Am","Cm","Bk","Cf","Es","Fm","Md","No","Lr","Rf","Db","Sg","Bh","Hs","Mt"};
	private static double[] meltList = {-259,-272,180,1278,2300,3500,-210,-218,-220,-249,98,639,660,1410,44,113,-101,-189,64,839,1539,1660,1890,1857,1245,1535,1495,1453,1083,420,30,937,81,217,-7,-157,39,769,1523,1852,2468,2617,2200,2250,1966,1552,962,321,157,232,630,449,114,-112,29,725,920,795,935,1010,1100,1072,822,1311,1360,1412,1470,1522,1545,824,1656,2150,2996,3410,3180,3045,2410,1772,1064,-39,303,327,271,254,302,-71,27,700,1050,1750,1568,1132,640,640,994,1340,986,900,860,1527,-9999,827,1627,-9999,-9999,-9999,-9999,-9999,-9999};
	private static double[] boilList = {-253,-269,1347,2970,2550,4827,-196,-183,-188,-246,883,1090,2467,2355,280,445,-35,-186,774,1484,2832,3287,3380,2672,1962,2750,2870,2732,2567,907,2403,2830,613,685,59,-153,688,1384,3337,4377,4927,4612,4877,3900,3727,2927,2212,765,2000,2270,1750,990,184,-108,678,1140,3469,3257,3127,3127,3000,1900,1597,3233,3041,2562,2720,2510,1727,1466,3315,5400,5425,5660,5627,5027,4527,3827,2807,357,1457,1740,1560,962,337,-62,677,1737,3200,4790,-9999,3818,3902,3235,2607,-9999,-9999,-9999,-9999,-9999,-9999,-9999,-9999,-9999,-9999,-9999,-9999,-9999,-9999};
	private static double[] densityList = {0.09,0.18,0.53,1.85,2.34,2.26,1.25,1.43,1.7,0.9,0.97,1.74,2.7,2.33,1.82,2.07,3.21,1.78,0.86,1.55,2.99,4.54,6.11,7.19,7.43,7.87,8.9,8.9,8.96,7.13,5.91,5.32,5.72,4.79,3.12,3.75,1.63,2.54,4.47,6.51,8.57,10.22,11.5,12.37,12.41,12.02,10.5,8.65,7.31,7.31,6.68,6.24,4.93,5.9,1.87,3.59,6.15,6.77,6.77,7.01,7.3,7.52,5.24,7.9,8.23,8.55,8.8,9.07,9.32,6.9,9.84,13.31,16.65,19.35,21.04,22.6,22.4,21.45,19.32,13.55,11.85,11.35,9.75,9.3,-9.999,9.73,-9.999,5.5,10.07,11.72,15.4,18.95,20.2,19.84,13.67,13.5,14.78,15.1,-9.999,-9.999,-9.999,-9.999,-9.999,-9.999,-9.999,-9.999,-9.999,-9.999,-9.999};
	private static int[] yearList = {1776,1895,1817,1797,1808,-9999,1772,1774,1886,1898,1807,1755,1825,1824,1669,-9999,1774,1894,1807,1808,1879,1791,1830,1797,1774,-9999,1735,1751,-9999,-9999,1875,1886,-9999,1817,1826,1898,1861,1790,1794,1789,1801,1781,1937,1844,1803,1803,-9999,1817,1863,-9999,-9999,1783,1811,1898,1860,1808,1839,1803,1885,1885,1945,1879,1901,1880,1843,1886,1867,1842,1879,1878,1907,1923,1802,1783,1925,1803,1803,1735,-9999,-9999,1861,-9999,-9999,1898,1940,1900,1939,1898,1899,1829,1913,1789,1940,1940,1944,1944,1949,1950,1952,1952,1955,1958,1961,1964,1967,1974,1981,1984,1982};
	private static int[] groupList = {1,18,1,2,13,14,15,16,17,18,1,2,13,14,15,16,17,18,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,1,2,3,101,101,101,101,101,101,101,101,101,101,101,101,101,101,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,1,2,3,102,102,102,102,102,102,102,102,102,102,102,102,102,102,4,5,6,7,8,9};
	private static String[] configList = {"1s1","1s2","[He] 2s1","[He] 2s2","[He] 2s2 2p1","[He] 2s2 2p2","[He] 2s2 2p3","[He] 2s2 2p4","[He] 2s2 2p5","[He] 2s2 2p6","[Ne] 3s1","[Ne] 3s2","[Ne] 3s2 3p1","[Ne] 3s2 3p2","[Ne] 3s2 3p3","[Ne] 3s2 3p4","[Ne] 3s2 3p5","[Ne] 3s2 3p6","[Ar] 4s1","[Ar] 4s2","[Ar] 3d1 4s2","[Ar] 3d2 4s2","[Ar] 3d3 4s2","[Ar] 3d5 4s1","[Ar] 3d5 4s2","[Ar] 3d6 4s2","[Ar] 3d7 4s2","[Ar] 3d8 4s2","[Ar] 3d10 4s1","[Ar] 3d10 4s2","[Ar] 3d10 4s2 4p1","[Ar] 3d10 4s2 4p2","[Ar] 3d10 4s2 4p3","[Ar] 3d10 4s2 4p4","[Ar] 3d10 4s2 4p5","[Ar] 3d10 4s2 4p6","[Kr] 5s1","[Kr] 5s2","[Kr] 4d1 5s2","[Kr] 4d2 5s2","[Kr] 4d4 5s1","[Kr] 4d5 5s1","[Kr] 4d5 5s2","[Kr] 4d7 5s1","[Kr] 4d8 5s1","[Kr] 4d10","[Kr] 4d10 5s1","[Kr] 4d10 5s2","[Kr] 4d10 5s2 5p1","[Kr] 4d10 5s2 5p2","[Kr] 4d10 5s2 5p3","[Kr] 4d10 5s2 5p4","[Kr] 4d10 5s2 5p5","[Kr] 4d10 5s2 5p6","[Xe] 6s1","[Xe] 6s2","[Xe] 5d1 6s2","[Xe] 4f1 5d1 6s2","[Xe] 4f3 6s2","[Xe] 4f4 6s2","[Xe] 4f5 6s2","[Xe] 4f6 6s2","[Xe] 4f7 6s2","[Xe] 4f7 5d1 6s2","[Xe] 4f9 6s2","[Xe] 4f10 6s2","[Xe] 4f11 6s2","[Xe] 4f12 6s2","[Xe] 4f13 6s2","[Xe] 4f14 6s2","[Xe] 4f14 5d1 6s2","[Xe] 4f14 5d2 6s2","[Xe] 4f14 5d3 6s2","[Xe] 4f14 5d4 6s2","[Xe] 4f14 5d5 6s2","[Xe] 4f14 5d6 6s2","[Xe] 4f14 5d7 6s2","[Xe] 4f14 5d9 6s1","[Xe] 4f14 5d10 6s1","[Xe] 4f14 5d10 6s2","[Xe] 4f14 5d10 6s2 6p1","[Xe] 4f14 5d10 6s2 6p2","[Xe] 4f14 5d10 6s2 6p3","[Xe] 4f14 5d10 6s2 6p4","[Xe] 4f14 5d10 6s2 6p5","[Xe] 4f14 5d10 6s2 6p6","[Rn] 7s1","[Rn] 7s2","[Rn] 6d1 7s2","[Rn] 6d2 7s2","[Rn] 5f2 6d1 7s2","[Rn] 5f3 6d1 7s2","[Rn] 5f4 6d1 7s2","[Rn] 5f6 7s2","[Rn] 5f7 7s2","None Found","None Found","None Found","None Found","None Found","None Found","None Found","None Found","None Found","None Found","None Found","None Found","None Found","None Found"};
	private static double[] energyList = {13.5984,24.5874,5.3917,9.3227,8.298,11.2603,14.5341,13.6181,17.4228,21.5645,5.1391,7.6462,5.9858,8.1517,10.4867,10.36,12.9676,15.7596,4.3407,6.1132,6.5615,6.8281,6.7462,6.7665,7.434,7.9024,7.881,7.6398,7.7264,9.3942,5.9993,7.8994,9.7886,9.7524,11.8138,13.9996,4.1771,5.6949,6.2173,6.6339,6.7589,7.0924,7.28,7.3605,7.4589,8.3369,7.5762,8.9938,5.7864,7.3439,8.6084,9.0096,10.4513,12.1298,3.8939,5.2117,5.5769,5.5387,5.473,5.525,5.582,5.6437,5.6704,6.1501,5.8638,5.9389,6.0215,6.1077,6.1843,6.2542,5.4259,6.8251,7.5496,7.864,7.8335,8.4382,8.967,8.9587,9.2255,10.4375,6.1082,7.4167,7.2856,8.417,9.3,10.7485,4.0727,5.2784,5.17,6.3067,5.89,6.1941,6.2657,6.0262,5.9738,5.9915,6.1979,6.2817,6.42,6.5,6.58,6.65,4.9,-9.999,-9.999,-9.999,-9.999,-9.999,-9.999};
	
	public static ArrayList<String> data = new ArrayList<String>();
	
	public static ArrayList<String> getInfo(String input) {
	  data.clear();
	  
		if (input.contains(".")) {
			double inMass = Double.parseDouble(input);
			String num = getNum(getName(inMass));
			int elemNum = Integer.parseInt(num);
			addData(getName(elemNum), input, getSym(elemNum), getMass(elemNum), getMelt(elemNum) + "°C", getBoil(elemNum) + "°C", getDensity(elemNum) + " g/cm^3", getYear(elemNum), getGroup(elemNum), getConfig(elemNum), getEnergy(elemNum));
		} else if (input.matches("[a-zA-Z]+")) {
			int elemNum = Integer.parseInt(getNum(input));
			addData(getName(elemNum), getNum(input), getSym(elemNum), getMass(elemNum), getMelt(elemNum) + "°C", getBoil(elemNum) + "°C", getDensity(elemNum) + " g/cm^3", getYear(elemNum), getGroup(elemNum), getConfig(elemNum), getEnergy(elemNum));
		} else {
			int elemNum = Integer.parseInt(input);
			addData(getName(elemNum), input, getSym(elemNum), getMass(elemNum), getMelt(elemNum) + "°C", getBoil(elemNum) + "°C", getDensity(elemNum) + " g/cm^3", getYear(elemNum), getGroup(elemNum), getConfig(elemNum), getEnergy(elemNum));
		}
		
		return data;
	}
	
	public static void addData(String name, String num, String sym, String mass, String melt, String boil, String density, String year, String group, String config, String energy) {
	  if (melt.equals("-9999.0°C")) melt = "Not Found";
    if (boil.equals("-9999.0°C")) boil = "Not Found";
    if (density.equals("-9.999 g/cm^3")) density = "Not Found";
    if (year.equals("-9999")) year = "Ancient";
    if (energy.equals("-9.999")) energy = "Not Found";
    
    data.add(name);
    data.add(num);
    data.add(sym);
    data.add(mass);
    data.add(melt);
    data.add(boil);
    data.add(density);
    data.add(year);
    data.add(group);
    data.add(config);
    data.add(energy);
	  
	}
	
	public static String getName(int num) {
		return nameList[num-1];
	}
	
	public static String getName(double mass) {
		return nameList[0];
	}
	
 	public static String getNum(String name) {
		int num = 0;
		
		for (int i = 0; i < nameList.length; i++) {
		  if (name.equals(nameList[i])) {
		    num = i + 1;
		    break;
		  }
		}
		
		return Integer.toString(num);
	}
	
	public static String getSym(int num) {
		return symList[num-1];	
	}
	
	public static String getMass(int num) {
		return Double.toString(massList[num-1]);
	}
	
	public static String getMelt(int num) {
		return Double.toString(meltList[num-1]);
	}
	
	public static String getBoil(int num) {
		return Double.toString(boilList[num-1]);
	}
	
	public static String getYear(int num) {
		return Integer.toString(yearList[num - 1]);
	}
	
	public static String getDensity(int num) {
		return Double.toString(densityList[num - 1]);
	}
	
	public static String getGroup(int num) {
		return Integer.toString(groupList[num - 1]);
	}
	
	public static String getConfig(int num) {
		return configList[num - 1];
	}
	
	public static String getEnergy(int num) {
		return Double.toString(energyList[num - 1]);
	}
	
}