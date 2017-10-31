BEGIN TRANSACTION;
DROP TABLE IF EXISTS questions;
CREATE TABLE questions (
        question_pair SERIAL, 
        question_name varchar(255),
        right_image varchar(255) NOT NULL,
        left_image varchar(255) NOT NULL,
        answer1 varchar(255),
        answer2 varchar(255),
        answer3 varchar(255),
        correct_answer int, 
        additional_info text
); 

INSERT INTO questions(question_name, left_image, right_image, answer1, answer2, answer3, correct_answer, additional_info) 
VALUES ('Bullet Train and KingFisher','KingFisher_Front.jpg', 'BulletTrain_Front.jpg', 'Create lift. Minimize drag. 
Maintain lift at varying angles and low speeds.', 'Prevent excessive air and ground surface warming', 
'Maintain seamless movement from low density to higher density mediums', 
3,
'The bullet train in Japan can travel 200 mph, but before the nose of the train was redesigned, the train made so much noise that it exceeded environmental standards.  
Noise was particularly problematic upon exiting tunnels, where the pressure wave of air that built up on the front of the train would create a very loud boom as the train left the tunnel.  The pressure pillow built up on the front of the train because the air did not move easily around the train in the confined space.
Kingfishers are birds that dive into water to catch fish.  They hover and then plunge into the water almost without making a splash as their beaks first enter the water, allowing them to see their prey as they enter.  Kingfishers face a similar challenge to the train of moving from a low resistance medium (air) to a high resistance medium (water) when diving for fish.  
Yet, because of the shape of their beaks, they are able to enter the water seamlessly, as the water moves around their beak and bodies, rather than being pushed in front of it as they enter.  
Elji Nakatsu, engineer with JR West (and birdwatcher), mimicked the form of the kingfisher''s beak on the train, allowing the air to move around the train instead of building up in front of it as the train entered narrow tunnels.  The results were impressive.  The train is now quieter (no more sonic booms), 10% faster and uses 15% less electricity.'

);

INSERT INTO questions(question_name,left_image, right_image, answer1, answer2, answer3, correct_answer, additional_info) 
VALUES ('Box Fish Car and Box Fish','BoxFish_Front.jpg', 'BoxfishCar_Front.jpg', 'Minimize drag and weight while maintaining high volume
', 'Produce vibrant color, highly visible in bright light, without requiring high energy inputs', 
'Prevent bacterial and algal colonization. Reduce drag in fluids', 
1,
'The bionic car was a concept car developed by Mercedes-Benz in 2005.  As they explain on their website:
“Mercedes-Benz researchers and engineers have for the first time searched for a prototype in nature that approximates an aerodynamic, safe, comfortable and environmentally compatible car. They found a source of inspiration that, despite its box-shaped body, has excellent aerodynamic properties: the boxfish.
The boxfish-inspired bionic car undercuts the drag coefficient values for modern compact cars by more than 65%. The boxfish is a model of rigidity and lightweight design. Its outer skin is made up of numerous bony hexagonal plates, which combine maximum strength with minimum weight. By transferring this principle to the bionic car, the weight of the bodyshell is reduced by about one third without diminishing its rigidity or crash safety.
The ''boxfish principle'' also achieves a significant reduction in fuel consumption: the 103 kW direct-injection diesel engine uses just 4.3 litres per 100 km [54 mpg] in the European combined driving cycle. This figure is 20 percent lower than that of a comparable series-production model. And at a constant 90 km/h, fuel consumption drops to just  2.8 litres per 100 km [84 mpg].
Minimum emissions also play a key role in the bionic car. As well as an oxidation catalytic converter and particulate filter as standard, a special technology is employed to convert nitrogen oxide into harmless nitrogen and water. The effect in the European test cycle is a reduction of up to 80% in nitrogen oxide emissions.” (source: www.la.mercedes-benz.com)'

);

COMMIT; 
    
               
