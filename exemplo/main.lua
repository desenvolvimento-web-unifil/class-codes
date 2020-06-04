function love.load()
    whale = love.graphics.newImage("assets/logo.png") 
    x, y = 0, 150
    width = love.graphics.getWidth()

end

function love.update()
    if(x < width) then x = x + 1 end
end

function love.draw()
    love.graphics.draw(whale, x, y)
    love.graphics.print("Hello World!", 400, 300)
end