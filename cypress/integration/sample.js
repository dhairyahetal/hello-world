// sample.js created with Cypress
//
// Start writing your Cypress tests below!
// If you're unfamiliar with how Cypress works,
// check out the link below and learn how to write your first test:
// https://on.cypress.io/writing-first-test
describe('My First Test', () => {
    it('Does not do much!', () => {
      expect(true).to.equal(true)
    })
  })
  describe('My Second Test', () => {
    it('Visits the Kitchen Sink', () => {
      cy.visit('https://example.cypress.io')
      cy.contains('Kitchen')
      cy.contains('Querying')
     
      Cypress.Commands.add('forceClick', {prevSubject: 'element'}, (subject, options) => {
        cy.wrap(subject).click({force: true})
      });

      cy.contains('Querying').forceClick()
    })
  })