/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Leveleditor.Act#getWorld <em>World</em>}</li>
 *   <li>{@link Leveleditor.Act#getActName <em>Act Name</em>}</li>
 *   <li>{@link Leveleditor.Act#getGotoAct <em>Goto Act</em>}</li>
 *   <li>{@link Leveleditor.Act#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see Leveleditor.LeveleditorPackage#getAct()
 * @model
 * @generated
 */
public interface Act extends EObject {
	/**
	 * Returns the value of the '<em><b>World</b></em>' containment reference list.
	 * The list contents are of type {@link Leveleditor.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>World</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>World</em>' containment reference list.
	 * @see Leveleditor.LeveleditorPackage#getAct_World()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Room> getWorld();

	/**
	 * Returns the value of the '<em><b>Act Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Act Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Act Name</em>' attribute.
	 * @see #setActName(String)
	 * @see Leveleditor.LeveleditorPackage#getAct_ActName()
	 * @model
	 * @generated
	 */
	String getActName();

	/**
	 * Sets the value of the '{@link Leveleditor.Act#getActName <em>Act Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Act Name</em>' attribute.
	 * @see #getActName()
	 * @generated
	 */
	void setActName(String value);

	/**
	 * Returns the value of the '<em><b>Goto Act</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goto Act</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goto Act</em>' reference.
	 * @see #setGotoAct(Act)
	 * @see Leveleditor.LeveleditorPackage#getAct_GotoAct()
	 * @model
	 * @generated
	 */
	Act getGotoAct();

	/**
	 * Sets the value of the '{@link Leveleditor.Act#getGotoAct <em>Goto Act</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goto Act</em>' reference.
	 * @see #getGotoAct()
	 * @generated
	 */
	void setGotoAct(Act value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Leveleditor.LeveleditorPackage#getAct_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Leveleditor.Act#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Act
