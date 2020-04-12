Feature: Buy a lot of products

Background:
    Given เรามีสินค้าเหล่านี้
        | เตารีด | 800  |
        | ตู้เย็น  | 3000 |
        | เตาอบ | 5000 |
        | ทีวิ    | 1000 |
Scenario1: Buy 3 products
    When  ฉันซื้อ ตู้เย็น with quantity 2
    And   ฉันซื้อ ทีวี with quantity 1
    And   ฉันซื้อ เตาอบ with quantity 1
    Then total should be 9500


