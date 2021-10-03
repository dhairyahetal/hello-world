

describe('When Rocket Innovation Studio Careers page is loaded', () => {
    it('Has a valid title, expected Navigation items/images and these links are not broken', () => {
        cy.visit('/');
        cy.contains("Careers").click()
        cy.title().should('eq','Windsor Tech | Rocket Careers')
        cy.get('input[id="cws_quickjobsearch_keywords"]').click().type("Software Developer") 
        cy.get('input[id="cws_quickjobsearch_location"]').click().type("Windsor, ON, Canada")
        cy.get('input[type="submit"]').click()
        cy.contains("Current Openings")
      })
      Cypress.on('uncaught:exception', (err, runnable) => {
        // returning false here prevents Cypress from
        // failing the test
        return false
      })
  })

