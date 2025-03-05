-- Création de la base de données avec le nouveau nom
CREATE DATABASE IF NOT EXISTS `modern_motivation_db`;
USE `modern_motivation_db`;

-- Création de la table des citations
CREATE TABLE IF NOT EXISTS `quotes` (
  `id` INT AUTO_INCREMENT PRIMARY KEY,
  `text` TEXT NOT NULL,
  `author` VARCHAR(255) NOT NULL
);

-- Insertion d'exemples de citations
INSERT INTO `quotes` (`text`, `author`) VALUES
('Le succès est la somme de petits efforts répétés jour après jour.', 'Romain Rolland'),
('La vie est un mystère qu\'il faut vivre, et non un problème à résoudre.', 'Gandhi'),
('L\'avenir appartient à ceux qui croient à la beauté de leurs rêves.', 'Eleanor Roosevelt'),
('La seule façon de faire du bon travail est d\'aimer ce que vous faites.', 'Steve Jobs'),
('Le succès n\'est pas final, l\'échec n\'est pas fatal: c\'est le courage de continuer qui compte.', 'Winston Churchill');
