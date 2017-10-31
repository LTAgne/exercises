BEGIN TRANSACTION;
DROP TABLE IF EXISTS questions;
CREATE TABLE questions (
        question_pair SERIAL, 
        right_image varchar(255) NOT NULL,
        left_image varchar(255) NOT NULL,
        answer1 varchar(255),
        answer2 varchar(255),
        answer3 varchar(255),
        correct_answer int, 
        additional_info text
); 

INSERT INTO questions(left_image, right_image, answer1, answer2, answer3, correct_answer, additional_info) 
VALUES ('KingFisher_Front.jpg', 'BulletTrain_Front.jpg', 'Create lift. Minimize drag. 
Maintain lift at varying angles and low speeds.', 'Prevent excessive air and ground surface warming', 
'Maintain seamless movement from low density to higher density mediums', 
3,
'The bullet train in Japan can travel 200 mph, but before the nose of the train was redesigned, the train made so much noise that it exceeded environmental standards.  
Noise was particularly problematic upon exiting tunnels, where the pressure wave of air that built up on the front of the train would create a very loud boom as the train left the tunnel.  The pressure pillow built up on the front of the train because the air did not move easily around the train in the confined space.
Kingfishers are birds that dive into water to catch fish.  They hover and then plunge into the water almost without making a splash as their beaks first enter the water, allowing them to see their prey as they enter.  Kingfishers face a similar challenge to the train of moving from a low resistance medium (air) to a high resistance medium (water) when diving for fish.  
Yet, because of the shape of their beaks, they are able to enter the water seamlessly, as the water moves around their beak and bodies, rather than being pushed in front of it as they enter.  
Elji Nakatsu, engineer with JR West (and birdwatcher), mimicked the form of the kingfisher''s beak on the train, allowing the air to move around the train instead of building up in front of it as the train entered narrow tunnels.  The results were impressive.  The train is now quieter (no more sonic booms), 10% faster and uses 15% less electricity.'
);
            
COMMIT; 