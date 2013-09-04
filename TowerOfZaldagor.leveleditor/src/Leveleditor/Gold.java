/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Leveleditor.Gold#getAmmount <em>Ammount</em>}</li>
 * </ul>
 * </p>
 *
 * @see Leveleditor.LeveleditorPackage#getGold()
 * @model
 * @generated
 */
public interface Gold extends Item {
	/**
	 * Returns the value of the '<em><b>Ammount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ammount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ammount</em>' attribute.
	 * @see #setAmmount(int)
	 * @see Leveleditor.LeveleditorPackage#getGold_Ammount()
	 * @model
	 * @generated
	 */
	int getAmmount();

	/**
	 * Sets the value of the '{@link Leveleditor.Gold#getAmmount <em>Ammount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ammount</em>' attribute.
	 * @see #getAmmount()
	 * @generated
	 */
	void setAmmount(int value);

} // Gold
