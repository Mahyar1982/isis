package org.nakedobjects.example.expenses;

import org.nakedobjects.application.control.User;
import org.nakedobjects.reflector.java.fixture.JavaFixture;
import org.nakedobjects.system.JavaExploration;


public class ExpensesExploration {

    public static void main(String[] args) {
        JavaExploration e = new JavaExploration();

        e.addFixture(new JavaFixture() {

            public void install() {
                registerClass(Employee.class);
                registerClass(Project.class);
                registerClass(Expense.class);
                registerClass(Claim.class);

                User user = new User();
                user.getName().setValue("expenses");

                Employee newUser;

                newUser = (Employee) createInstance(Employee.class);
                newUser.getFirstName().setValue("Jeff");
                newUser.getSurname().setValue("Swords");

                newUser = (Employee) createInstance(Employee.class);
                newUser.getFirstName().setValue("Dawn");
                newUser.getSurname().setValue("Behan");

                newUser = (Employee) createInstance(Employee.class);
                newUser.getFirstName().setValue("Enda");
                newUser.getSurname().setValue("Brady");

                newUser.getAccount().getAccountNumber().setValue("3324531");

                Project newProject;

                newProject = (Project) createInstance(Project.class);
                newProject.getName().setValue("Rural");

                newUser.addToProjects(newProject);

                newProject = (Project) createInstance(Project.class);
                newProject.getName().setValue("Irish Life");

                newUser.addToProjects(newProject);

                newProject = (Project) createInstance(Project.class);
                newProject.getName().setValue("AIA");
            }
        });

        e.display();

    }

}

/*
 * Naked Objects - a framework that exposes behaviourally complete business
 * objects directly to the user. Copyright (C) 2000 - 2005 Naked Objects Group
 * Ltd
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place, Suite 330, Boston, MA 02111-1307 USA
 * 
 * The authors can be contacted via www.nakedobjects.org (the registered address
 * of Naked Objects Group is Kingsway House, 123 Goldworth Road, Woking GU21
 * 1NR, UK).
 */